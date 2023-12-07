package com.example.productservice_proxy.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchRequestDto {
    private String query;
    private int pageNumber;
    private int sizeOfPage;
}
