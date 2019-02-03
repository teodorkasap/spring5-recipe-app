package com.erolerten.spring5recipeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Spring5RecipeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5RecipeAppApplication.class, args);
    }

    @RequestMapping({"/", "", "index"})
    public String getIndexPage(){
        return "index";
    }
}

