package szymon017.springframework.recipespringweb.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import szymon017.springframework.recipespringweb.domain.Category;
import szymon017.springframework.recipespringweb.domain.UnitOfMeasure;
import szymon017.springframework.recipespringweb.repositories.CategoryRepository;
import szymon017.springframework.recipespringweb.repositories.UnitOfMeasureRepository;
import szymon017.springframework.recipespringweb.services.RecipeService;

import java.util.Optional;

@Controller
@Slf4j
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index Page");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}