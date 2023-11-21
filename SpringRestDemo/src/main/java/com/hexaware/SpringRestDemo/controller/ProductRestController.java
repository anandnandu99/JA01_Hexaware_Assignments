package com.hexaware.SpringRestDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
    private static final Logger logger = LoggerFactory.getLogger(ProductRestController.class);

    @GetMapping("/getall")
    public String getAllProducts() {
        logger.info("Getting all products");
        return "All products will be displayed";
    }

    @PostMapping("/add")
    public String addProduct() {
        logger.info("Adding a product");
        return "Product Added";
    }

    @PutMapping("/update")
    public String updateProduct() {
        logger.info("Updating a product");
        return "Product updated";
    }

    @DeleteMapping("/delete")
    public String deleteProduct() {
        logger.info("Deleting a product");
        return "Product deleted";
    }
}
