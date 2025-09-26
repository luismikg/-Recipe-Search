package com.luis.search.domain.model

data class RecipeDetails(
    val idMeal: String,
    val strArea: String,
    val strCategory: String,
    val strYoutube: String,
    val strTags: String,
    val strMeal: String,
    val strMealThumb: String,
    val strInstructions: String,
    val ingredientsPair: List<Pair<String, String>>
)
