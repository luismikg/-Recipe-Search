package com.luis.search.data.mappers

import com.luis.search.data.model.RecipeDTO
import com.luis.search.domain.model.Recipe
import com.luis.search.domain.model.RecipeDetails

fun List<RecipeDTO>.toDomain(): List<Recipe> = map {
    Recipe(
        idMeal = it.idMeal,
        strArea = it.strArea,
        strCategory = it.strCategory,
        strYoutube = it.strYoutube ?: "",
        strTags = it.strTags ?: "",
        strMeal = it.strMeal,
        strMealThumb = it.strMealThumb,
        strInstructions = it.strInstructions
    )
}

fun RecipeDTO.toDomain(): RecipeDetails =
    RecipeDetails(
        idMeal = this.idMeal,
        strArea = this.strArea,
        strCategory = this.strCategory,
        strYoutube = this.strYoutube ?: "",
        strTags = this.strTags ?: "",
        strMeal = this.strMeal,
        strMealThumb = this.strMealThumb,
        strInstructions = this.strInstructions,
        ingredientsPair = this.getIngredientPairWithItsMeasure()
    )

fun RecipeDTO.getIngredientPairWithItsMeasure(): List<Pair<String, String>> {
    val list = mutableListOf<Pair<String, String>>()

    list.add(Pair(this.strIngredient1.getOrEmpty(), this.strMeasure1.getOrEmpty()))
    list.add(Pair(this.strIngredient2.getOrEmpty(), this.strMeasure2.getOrEmpty()))
    list.add(Pair(this.strIngredient3.getOrEmpty(), this.strMeasure3.getOrEmpty()))
    list.add(Pair(this.strIngredient4.getOrEmpty(), this.strMeasure4.getOrEmpty()))
    list.add(Pair(this.strIngredient5.getOrEmpty(), this.strMeasure5.getOrEmpty()))
    list.add(Pair(this.strIngredient6.getOrEmpty(), this.strMeasure6.getOrEmpty()))
    list.add(Pair(this.strIngredient7.getOrEmpty(), this.strMeasure7.getOrEmpty()))
    list.add(Pair(this.strIngredient8.getOrEmpty(), this.strMeasure8.getOrEmpty()))
    list.add(Pair(this.strIngredient9.getOrEmpty(), this.strMeasure9.getOrEmpty()))
    list.add(Pair(this.strIngredient10.getOrEmpty(), this.strMeasure10.getOrEmpty()))
    list.add(Pair(this.strIngredient11.getOrEmpty(), this.strMeasure11.getOrEmpty()))
    list.add(Pair(this.strIngredient12.getOrEmpty(), this.strMeasure12.getOrEmpty()))
    list.add(Pair(this.strIngredient13.getOrEmpty(), this.strMeasure13.getOrEmpty()))
    list.add(Pair(this.strIngredient14.getOrEmpty(), this.strMeasure14.getOrEmpty()))
    list.add(Pair(this.strIngredient15.getOrEmpty(), this.strMeasure15.getOrEmpty()))
    list.add(Pair(this.strIngredient16.getOrEmpty(), this.strMeasure16.getOrEmpty()))
    list.add(Pair(this.strIngredient17.getOrEmpty(), this.strMeasure17.getOrEmpty()))
    list.add(Pair(this.strIngredient18.getOrEmpty(), this.strMeasure18.getOrEmpty()))
    list.add(Pair(this.strIngredient19.getOrEmpty(), this.strMeasure19.getOrEmpty()))
    list.add(Pair(this.strIngredient20.getOrEmpty(), this.strMeasure20.getOrEmpty()))

    return list
}

fun String?.getOrEmpty() = this?.ifEmpty { "" } ?: ""
