package com.example.productservice_proxy.inheritanceexamples.mappedsupperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "mps_ta")
public class TA extends User {
    private double rating;
}
