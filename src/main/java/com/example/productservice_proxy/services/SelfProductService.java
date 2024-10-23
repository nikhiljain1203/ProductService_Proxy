package com.example.productservice_proxy.services;

import com.example.productservice_proxy.models.Product;
import com.example.productservice_proxy.repostries.ProductElasticSearchRepo;
import com.example.productservice_proxy.repostries.ProductRepo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Primary
//@Service
public class SelfProductService implements IProductService {

    ProductRepo productRepo;
    //ProductElasticSearchRepo productElasticSearchRepo;

    public SelfProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
        //this.productElasticSearchRepo = productElasticSearchRepo;
    }
    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getSingleProduct(Long productId) {
        return productRepo.getReferenceById(productId);
    }

    @Override
    public Product addNewProduct(Product product) {
        this.productRepo.save(product);
        //this.productElasticSearchRepo.save(product);
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
