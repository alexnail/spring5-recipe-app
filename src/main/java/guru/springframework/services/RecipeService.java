package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * @author <a href="mailto:alexnail@gmail.com">Alexander Fridman</a>
 * Date: 8/25/18
 * Time: 12:46 PM
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
