package com.example.productservice_proxy.controllers;

import com.example.productservice_proxy.dtos.ProductDto;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;


// This controller will always answer products
@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("")
    public String getAllProducts() {
        return "Getting all the products";
    }

    @GetMapping("/{id}")
    public String getSingleProduct(@PathVariable("id") Long productId) {
        return "Returning Single Product with id: " + productId;
    }

    @PostMapping()
    public String addNewProduct(@RequestBody ProductDto productDto) {
        return "Adding new product " + productDto;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId) {
        return "Updating product";
    }

    @PatchMapping("/{productId}")
    public String patchProduct(@PathVariable("productId") Long productId) {
        return "Patching product";
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
        return "Deleting a product with id: " + productId;
    }
}
