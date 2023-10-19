package com.example.productservice_proxy.repostries;

import com.example.productservice_proxy.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Categories, Long> {
    Categories save(Categories categories);

    Categories findById(long id);
}
