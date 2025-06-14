package com.mustore.store.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @GetMapping
    public String getProducts() {
       return "Products List";
    }
}
