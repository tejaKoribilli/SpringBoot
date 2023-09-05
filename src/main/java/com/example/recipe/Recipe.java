// Write your code here
package com.example.recipe;

import java.util.*;

public class Recipe{
    private int recipeId;
    private String recipeName;
    private String recipeType;
    private List<String> ingredients;

    public Recipe(int recipeId, String recipeName, String recipeType, List<String> ingredients){
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.recipeType = recipeType;
        this.ingredients = ingredients;
    }

    public int getRecipedId(){
        return this.recipeId;
    }

    public void setRecipedId(int recipeId){
        this.recipeId = recipeId;
    }

    public String getRecipeName(){
        return this.recipeName;
    }

    public void setRecipeName(String recipeName){
        this.recipeName = recipeName;
    }

    public String getRecipeType(){
        return this.recipeType;
    }

    public void setRecipeType(String recipeType){
        this.recipeType = recipeType;
    }

    public List<String> getIngredients(){
        return this.ingredients;
    }

    public void setIngredients(List<String> ingredients){
        this.ingredients = ingredients;
    }

}
