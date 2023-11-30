package com.example.productservice_proxy.repostries;

import com.example.productservice_proxy.models.Categories;
import com.example.productservice_proxy.models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepoTest {

    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private CategoryRepo categoryRepo;

//    @Test
//    @Transactional
//    void saveProductsAndCategory() {
//        Categories categories = new Categories();
//        categories.setName("Electronics");
//        categories.setDescription("Electronics");
//        categories = categoryRepo.save(categories);
//
//        Product product = new Product();
//        product.setTitle("Laptop");
//        product.setDescription("Laptop");
//        product.setCategory(categories);
//        productRepo.save(product);
//
//        Categories categories1 = categoryRepo.findById(1);
//        List<Product> productList = categories1.getProductList();
//        System.out.println("Debug");
//
//    }

    @Test
    //@Transactional
    void saveProductsAndCategory2() {
        Categories categories = new Categories();
        categories.setName("Fashion");
        categories.setDescription("Fashion");
        //categories = categoryRepo.save(categories);

        Product product = new Product();
        product.setTitle("Tshirt");
        product.setDescription("Tshirt");
        product.setCategory(categories);
        productRepo.save(product);

        //Categories categories1 = categoryRepo.findById(categories.getId()).get();
        //List<Product> productList = categories1.getProductList();
        System.out.println("Debug");

    }

    @Test
    @Transactional
    void saveProductsAndCategory1() {
        Product product = new Product();
        product.setTitle("Laptop");
        product.setDescription("Laptop");
        productRepo.save(product);

        Categories categories = new Categories();
        categories.setName("Electronics");
        categories.setDescription("Electronics");
        categories.setProductList(List.of(product));
        categories = categoryRepo.save(categories);

        Categories categories1 = categoryRepo.findById(categories.getId()).get();
        List<Product> productList = categories1.getProductList();
        System.out.println("Debug");

    }


    @Test
    @Transactional
    @Rollback(value = false)
    void saveProductsAndCategory3() {
        Categories category = categoryRepo.findById(2L);
        //List<Product> productList = category.getProductList();
//        for (Product product : productList) {
//            System.out.println(product.getPrice());
//        }
        System.out.println("Debug");

//        Product product = new Product();
//        product.setPrice(1012);
//        product.setImageUrl("hiii");
//        product.setCategory(category);
//        Product savedProduct = productRepo.save(product);
//
//        product = new Product();
//        product.setPrice(103);
//        product.setImageUrl("hiii");
//        product.setCategory(category);
//        productRepo.save(product);


    }

    @Test
    @Transactional
    //@Rollback(value = false)
    void saveProductsAndCategory4() {
//        Categories category = categoryRepo.findById(2L);
//        List<Product> productList = category.getProductList();
//        for (Product product : productList) {
//            System.out.println(product.getPrice());
//        }

//        Product product = productRepo.findByPriceBetween(1000, 1012);
        List<Product> productList = productRepo.findByIdIsNotNullOrderByPrice();
//        String s = productRepo.findTitleById(252L);
        System.out.println("Debug");


//        Product product = new Product();
//        product.setPrice(1012);
//        product.setImageUrl("hiii");
//        product.setCategory(category);
//        Product savedProduct = productRepo.save(product);
//
//        product = new Product();
//        product.setPrice(103);
//        product.setImageUrl("hiii");
//        product.setCategory(category);
//        productRepo.save(product);


    }
}