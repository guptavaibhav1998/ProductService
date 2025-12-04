package com.scaler.productservice.exceptions;

public class ProductNotFoundException extends Exception{

    private Long productId;

    public ProductNotFoundException(Long productId){
        this.productId = productId;
    } 

    public Long getProductId(){
        return productId;
    }
 
}
