package com.example.productservice_proxy.controllers;

import com.example.productservice_proxy.models.Product;
import com.example.productservice_proxy.services.IProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProductControllerTest {

    @MockBean
    IProductService productService;

    @Autowired
    ProductController productController;

    @Test
    void test_whenGetProductIsCalled_ReturnProducts() {
        Product product = new Product();
        product.setId(2l);
        product.setTitle("test");
        when(productService.getSingleProduct(any(Long.class))).thenReturn(product);

        ResponseEntity<Product> productResponseEntity = productController.getSingleProduct(2l);

        assertNotNull(productResponseEntity);
        assertEquals("test", productResponseEntity.getBody().getTitle());
    }

    @Test
    void test_whenGetProductIsCalled_ReturnException() {
        when(productService.getSingleProduct(any(Long.class)))
                .thenThrow(new RuntimeException("Something is wrong"));

        assertThrows(RuntimeException.class, () ->productController.getSingleProduct(2l));
    }
}