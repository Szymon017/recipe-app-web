package szymon017.springframework.recipespringweb.services;

import szymon017.springframework.recipespringweb.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
