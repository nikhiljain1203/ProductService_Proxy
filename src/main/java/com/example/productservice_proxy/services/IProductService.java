package com.example.productservice_proxy.services;

import com.example.productservice_proxy.clients.IClientProductDto;
import com.example.productservice_proxy.dtos.ProductDto;
import com.example.productservice_proxy.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();

    Product getSingleProduct(Long productId);

    Product addNewProduct(Product product);

    Product updateProduct(Long productId, Product product);

    String deleteProduct(Long productId);
}
