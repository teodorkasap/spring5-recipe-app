package com.erolerten.spring5recipeapp.controllers;

import com.erolerten.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IngredientController {

    private final RecipeService recipeService;


    public IngredientController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @GetMapping
    @RequestMapping("/recipe/{recipeID}/ingredients")
    public String listIngredients(@PathVariable String recipeID, Model model){
        log.debug("Getting list of ingredients for Recipe ID: "+ recipeID);

        // use command object to avoid lazy load errors in Thymeleaf.
        model.addAttribute("recipe",recipeService.findCommandById(Long.valueOf(recipeID)));

        return "recipe/ingredient/list";
    }


}
