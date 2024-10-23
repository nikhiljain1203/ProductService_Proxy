package com.example.productservice_proxy.clients.fakestore.dto;

import com.example.productservice_proxy.clients.IClientProductDto;
import com.example.productservice_proxy.dtos.RatingDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class FakeStoreProductDto implements IClientProductDto, Serializable {
    private Long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;
    private RatingDto rating;
}
