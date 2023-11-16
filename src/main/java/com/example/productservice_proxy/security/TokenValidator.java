package com.example.productservice_proxy.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class TokenValidator {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    public Optional<JwtObject> validateToken(String token) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        /*
        Additional Validation logic
        Such as Role Verification

         */
        return Optional.empty();
    }

}
