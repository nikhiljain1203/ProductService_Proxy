package com.example.productservice_proxy.inheritanceexamples.mappedsupperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "mps_instructor")
public class Instructor extends User {
    private String company;
}
