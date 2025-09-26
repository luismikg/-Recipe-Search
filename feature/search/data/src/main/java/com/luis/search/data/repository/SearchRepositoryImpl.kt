package com.luis.search.data.repository

import com.luis.search.data.remote.SearchApiService
import com.luis.search.domain.model.Recipe
import com.luis.search.domain.model.RecipeDetails
import com.luis.search.domain.repository.SearchRepository

class SearchRepositoryImpl(
    private val searchApiService: SearchApiService
) : SearchRepository {
    override suspend fun getRecipes(s: String): List<Recipe> {
        return searchApiService.getRecipes(s)
    }

    override suspend fun getRecipeDetails(id: String): RecipeDetails {
        return searchApiService.getRecipesDetails(i=id)
    }
}