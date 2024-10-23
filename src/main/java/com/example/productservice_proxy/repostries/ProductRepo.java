package com.example.productservice_proxy.repostries;

import com.example.productservice_proxy.models.Product;
import com.example.productservice_proxy.projections.ProductWithIdAndTitle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    Product save(Product product); // (save) is a method of JpaRepository (interface)

    Product findProductById(Long Id);
    Product findByPriceBetween(double greaterthan, double lessthan);

    //Product findByProductName(String productName);

   // String findTitleById(Long id);

    List<Product> findByIdIsNotNullOrderByPrice();

    List<Product> findAllByIsPublicFalse();
    List<Product> findByTitleEquals(String title, Pageable pageable);

    //@Query("select p from Product p where p.title = :t")
    List<Product> foo(@Param("t") String title);

    @Query("select p.id as id, p.title as title from Product p where p.title = :t join with order")
    List<ProductWithIdAndTitle> foo2(@Param("t") String title);

    @Query(value = "select p.id from Product p where p.title = :title", nativeQuery = true)
    List<ProductWithIdAndTitle> foo3(@Param("title") String title);
}
