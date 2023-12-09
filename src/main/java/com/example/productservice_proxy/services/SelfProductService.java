package com.example.productservice_proxy.services;

import com.example.productservice_proxy.models.Product;
import com.example.productservice_proxy.repostries.ProductElasticSearchRepo;
import com.example.productservice_proxy.repostries.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class SelfProductService implements IProductService {

    ProductRepo productRepo;
    ProductElasticSearchRepo productElasticSearchRepo;

    public SelfProductService(ProductRepo productRepo, ProductElasticSearchRepo productElasticSearchRepo) {
        this.productRepo = productRepo;
        this.productElasticSearchRepo = productElasticSearchRepo;
    }
    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public Product addNewProduct(Product product) {
        this.productRepo.save(product);
        this.productElasticSearchRepo.save(product);
        return product;
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public String deleteProduct(Long productId) {
        return null;
    }
}
