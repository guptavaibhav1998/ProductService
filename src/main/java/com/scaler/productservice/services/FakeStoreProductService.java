package com.scaler.productservice.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.scaler.productservice.models.Category;
import com.scaler.productservice.models.Product;

import dtos.FakeStoreProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpMethod;
import org.springframework.core.ParameterizedTypeReference;

@Service
public class FakeStoreProductService implements ProductService {

    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getSingleProduct(String productId) {
        // This is a fake store product service, so we need to get the product from the fake store.
        // So we need to call the fake store API to get the product with the given productId.
        // https://fakestoreapi.com/products/1

        ResponseEntity<FakeStoreProductDto> responseEntity = 
        restTemplate.getForEntity(
            "https://fakestoreapi.com/products/" + productId, 
            FakeStoreProductDto.class);

        FakeStoreProductDto fakeStoreProductDto = responseEntity.getBody();

        return convertFakeStoreProductDtoToProduct(fakeStoreProductDto);
    }

    private Product convertFakeStoreProductDtoToProduct(FakeStoreProductDto fakeStoreProductDto) {
        if (fakeStoreProductDto == null) {
            return null;
        }
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setImageURL(fakeStoreProductDto.getImage());
        product.setPrice(fakeStoreProductDto.getPrice());

        Category category = new Category();
        category.setTitle(fakeStoreProductDto.getCategory());
        product.setCategory(category);

        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        ResponseEntity<List<FakeStoreProductDto>> responseEntity = 
        restTemplate.exchange(
            "https://fakestoreapi.com/products",
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<FakeStoreProductDto>>() {}
        );

        List<FakeStoreProductDto> fakeStoreProductDtos = responseEntity.getBody();
        List<Product> products = new ArrayList<Product>();
        for (FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtos) {
            products.add(convertFakeStoreProductDtoToProduct(fakeStoreProductDto));
        }
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long productId) {
        return;
    }

    
}
