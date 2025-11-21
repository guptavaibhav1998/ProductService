package com.scaler.productservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter // This is a Lombok annotation that generates the getters and setters for the class
public class Product extends BaseModel {
    private String title; 
    private String description;
    private String imageURL;
    private Double price;
    private Category category;

}
 