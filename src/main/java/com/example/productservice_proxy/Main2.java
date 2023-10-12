package com.example.productservice_proxy;

import com.example.productservice_proxy.dtos.ProductDto;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        ProductDto productDto =  new ProductDto();
        System.out.println(productDto.toString());
        List<Integer> l1 = List.of(1, 2, 3, 4);
        List<String> l2 = List.of(
                "Hello",
                "Hi",
                "Hey"
        );

        System.out.println(l1.getClass().getName());
        System.out.println(l2.getClass().getName());
    }
}
