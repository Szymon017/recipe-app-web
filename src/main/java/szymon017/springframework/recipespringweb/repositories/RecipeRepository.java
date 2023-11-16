package szymon017.springframework.recipespringweb.repositories;

import org.springframework.data.repository.CrudRepository;
import szymon017.springframework.recipespringweb.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
