package com.example.productservice_proxy.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Entity
@Document(indexName = "productservice")
public class Product extends BaseModel{
    private String title;
    private double price;
    private String description;
    @ManyToOne(cascade= CascadeType.ALL)
    private Categories category;
    private String imageUrl;
    private Boolean isPublic;
    private int numberOfUnits;
}
