package com.luis.search.data.repository

import com.luis.search.data.mappers.toDomain
import com.luis.search.data.remote.SearchApiService
import com.luis.search.domain.model.Recipe
import com.luis.search.domain.model.RecipeDetails
import com.luis.search.domain.repository.SearchRepository

class SearchRepositoryImpl(
    private val searchApiService: SearchApiService
) : SearchRepository {
    override suspend fun getRecipes(s: String): Result<List<Recipe>> {
        val response = searchApiService.getRecipes(s)
        return when(response.isSuccessful){
            true -> {
                response.body()?.meals?.let {
                    Result.success(it.toDomain())
                } ?: run{
                    Result.failure(Exception("Error Occurred"))
                }
            }
            false -> {
                Result.failure(Exception("Error Occurred"))
            }
        }
    }

    override suspend fun getRecipeDetails(id: String): Result<RecipeDetails> {

        val response = searchApiService.getRecipesDetails(id)
        return when(response.isSuccessful){
            true -> {
                response.body()?.meals?.let {
                    if(it.isNotEmpty()) {
                        Result.success(it.first().toDomain())
                    } else {
                        Result.failure(Exception("Error Occurred"))
                    }
                } ?: run {
                    Result.failure(Exception("Error Occurred"))
                }
            }
            false -> {
                Result.failure(Exception("Error Occurred"))
            }
        }
    }
}