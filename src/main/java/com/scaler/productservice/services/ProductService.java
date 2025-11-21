package com.scaler.productservice.services;

import java.util.List;
import com.scaler.productservice.models.Product;

public interface ProductService {
    Product getSingleProduct(String productId);
    List<Product> getAllProducts();
    Product createProduct(Product product);
    Product replaceProduct(Long productId, Product product);
    void deleteProduct(Long productId);
}
 