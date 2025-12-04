package com.scaler.productservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.scaler.productservice.models.Category;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @GetMapping("/{categoryId}")
    public Category getCategorybyId(@PathVariable("categoryId") String categoryId){
        throw new RuntimeException("Category not found");
    }

}
 