package com.luis.search.domain.repository

import com.luis.search.domain.model.Recipe
import com.luis.search.domain.model.RecipeDetails

interface SearchRepository {

    suspend fun getRecipes(s:String): Result<List<Recipe>>

    suspend fun getRecipeDetails(id: String): Result<RecipeDetails>
}