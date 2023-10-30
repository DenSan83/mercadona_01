package com.devdensan.mercadona.controller;

import com.devdensan.mercadona.model.Product;
import com.devdensan.mercadona.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> home() {
        return productService.getProducts();
    }
}
