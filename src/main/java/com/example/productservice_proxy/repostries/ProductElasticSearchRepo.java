package com.example.productservice_proxy.repostries;

import com.example.productservice_proxy.models.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductElasticSearchRepo
        extends ElasticsearchRepository<Product, Long> {
    Iterable<Product> findAllByTitleEquals(String title);

    @Query("{\n" +
            "  \"query\": {\n" +
            "    \"match\": {\n" +
            "      \"FIELD\": \"TEXT\"\n" +
            "    }\n" +
            "  }\n" +
            "}")
    List<Product> findAllByTitleContaining(String query);
}
