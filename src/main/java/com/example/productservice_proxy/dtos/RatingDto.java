package com.example.productservice_proxy.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class RatingDto implements Serializable {
    private double rate;
    private double count;
}