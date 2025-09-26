package com.luis.search.domain.repository

import com.luis.search.domain.model.Recipe
import com.luis.search.domain.model.RecipeDetails

interface SearchRepository {

    suspend fun getRecipes(): List<Recipe>

    suspend fun getRecipeDetails(id: String): RecipeDetails
}