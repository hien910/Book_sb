package com.example.product.controller;

import com.example.product.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final List<Product> products;
    public ProductController() {
        products = new ArrayList<>();

        products.add(new Product("1", "Iphone6", "description 1", 500, "Apple"));
        products.add(new Product("2", "Iphone6s", "description 2", 550, "Apple"));
        products.add(new Product("3", "IphoneXS", "description 3", 700, "Apple"));
        products.add(new Product("4", "Iphone15", "description 4", 1500, "Apple"));
        products.add(new Product("5", "Iphone11", "description 5", 799, "Apple"));
        products.add(new Product("6", "Iphone12", "description 6", 850, "Apple"));
        products.add(new Product("7", "Iphone13", "description 7", 999, "Apple"));
        products.add(new Product("8", "Iphone14", "description 8", 1200, "Apple"));

    }

    @GetMapping
    public List<Product> getProduct() {
        return products;
    }
}
