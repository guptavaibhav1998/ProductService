package com.scaler.productservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.scaler.productservice.models.Product;
import com.scaler.productservice.services.ProductService;

@RestController
@RequestMapping("/products") // This is the endpoint for this controller. Till this point, the endpoint is localhost:8080/products
public class ProductController {
    
    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{productId}")
    public Product getSingleProduct(@PathVariable("productId") String productId){
        return productService.getSingleProduct(productId);
    }

    @GetMapping()
    public List<Product> getAllProducts(){
        return new ArrayList<>();
    }

    @PostMapping()
    public Product createProduct(@RequestBody Product product){
        return null;
    }

    @PutMapping("/{productId}")
    public Product replaceProduct(@PathVariable("productId") String productId, @RequestBody Product product){
        return null;

    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable("productId") String productId){
        // This is a void method, so we don't need to return anything.
        // So we can just return void.
    }
} 
 