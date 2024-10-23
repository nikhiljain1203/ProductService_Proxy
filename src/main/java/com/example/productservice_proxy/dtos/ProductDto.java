package com.example.productservice_proxy.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class ProductDto implements Serializable {
    private Long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;
    private RatingDto rating;
}
