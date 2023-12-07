package com.example.productservice_proxy.services;

import com.example.productservice_proxy.models.Product;
import com.example.productservice_proxy.repostries.ProductRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    private ProductRepo productRepo;

    public SearchService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Page<Product> searchProducts(String query, int pageNumber, int sizeOfPage) {
        return productRepo.findByTitleEquals(query, PageRequest.of(pageNumber, sizeOfPage));
    }
}
