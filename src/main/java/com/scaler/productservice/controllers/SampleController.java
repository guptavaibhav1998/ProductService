package com.scaler.productservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/hello/{name}/{times}")
    public String sayHello(@PathVariable("name") String name,
            @PathVariable("times") int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += "Hello " + name + "! <br>";
        }
        return result;
        // SO now the enpoint for this function is localhost:8080/sample/hello
    }

    @GetMapping("/hi")
    public String sayHi() {
        return "Hi World";
        // SO now the enpoint for this function is localhost:8080/sample/hi
    }
}

/*
 * @RestController is a stereotype annotation that combines @Controller
 * and @ResponseBody,
 * 
 * @Controller is a stereotype annotation that marks the class as a web request
 * handler,
 * 
 * @ResponseBody is a annotation that marks the return value of the method as
 * the response body,
 * 
 * @RequestMapping is a annotation that maps the request URL to the method,
 * 
 * @GetMapping is a annotation that maps the GET request to the method,
 * 
 * @PostMapping is a annotation that maps the POST request to the method,
 * 
 * @PutMapping is a annotation that maps the PUT request to the method,
 * 
 * @DeleteMapping is a annotation that maps the DELETE request to the method,
 * 
 * @PatchMapping is a annotation that maps the PATCH request to the method,
 * 
 * 
 * 
 * API related to Orders, Payments, Products, Users, Categories, Reviews, Carts,
 * Wishlists, Addresses, Coupons, Orders, Payments will go to the respective
 * Controllers.
 * For every endpoint, we will have a separate Controller. So if any request
 * comes to amazon.in/orders, it will be handled by the OrderController.
 * So now we need to create a mapping of the endpoints to the Controllers. That
 * is if a request comes to amazon.in/orders, it will be handled by the
 * OrderController.
 * 
 * 
 * amazon.in/orders -> OrderController
 * /orders -> OrderController => Request Mapping("/orders")
 * /orders is called an endpoint. So endpoint for this controller is "/orders".
 * Now inside orderController, we can have 10 APIs. So we can have 10 methods in
 * the orderController.
 * So each method will be a separate API.
 * So each method will be a separate API.
 * Every method will be a separate API. and shoul have seperate path.
 * For example, if we have a method in the orderController called "getOrders",
 * then the path for this method should be "/orders/getOrders".
 * Similarly, if we have a method in the orderController called "createOrder",
 * then the path for this method should be "/orders/createOrder".
 * Similarly, if we have a method in the orderController called "updateOrder",
 * then the path for this method should be "/orders/updateOrder".
 * Similarly, if we have a method in the orderController called "deleteOrder",
 * then the path for this method should be "/orders/deleteOrder".
 * Similarly, if we have a method in the orderController called "getOrderById",
 * then the path for this method should be "/orders/getOrderById".
 * Similarly, if we have a method in the orderController called "getOrderById",
 * then the path for this method should be "/orders/getOrderById".
 * localhost:8080/orders/getOrders
 * 
 * 
 * 
 * amazon.in/payments -> PaymentController
 * /payments -> PaymentController => Request Mapping("/payments")
 * 
 * 
 * 
 * amazon.in/products -> ProductController
 * /products -> ProductController => Request Mapping("/products")
 * 
 * 
 * amazon.in/users -> UserController
 * /users -> UserController => Request Mapping("/users")
 * 
 * 
 * amazon.in/categories -> CategoryController
 * /categories -> CategoryController => Request Mapping("/categories")
 * 
 * 
 * amazon.in/reviews -> ReviewController
 * /reviews -> ReviewController => Request Mapping("/reviews")
 * 
 * 
 * amazon.in/carts -> CartController
 * /carts -> CartController => Request Mapping("/carts")
 * 
 * 
 * amazon.in/wishlists -> WishlistController
 * 
 * 
 * 
 * amazon.in/addresses -> AddressController
 * /addresses -> AddressController => Request Mapping("/addresses")
 * 
 * 
 * amazon.in/coupons -> CouponController
 * /coupons -> CouponController => Request Mapping("/coupons")
 * 
 * 
 * amazon.in/orders -> OrderController
 * /orders -> OrderController => Request Mapping("/orders")
 * 
 * 
 * amazon.in/payments -> PaymentController
 * /payments -> PaymentController => Request Mapping("/payments")
 */