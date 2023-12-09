package com.example.productservice_proxy.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {
    /**
     * Authenticate every request
     * @param http
     * @return
     * @throws Exception
     */
    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http)
            throws Exception {
//        http.authorizeHttpRequests((authorize) -> authorize.anyRequest().authenticated())
//                .formLogin(Customizer.withDefaults());
        http
                .authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers("/*").permitAll()

                )
                .oauth2ResourceServer((oauth2) -> oauth2.jwt(Customizer.withDefaults()))
                .cors().disable()
                .csrf().disable();
        return http.build();

    }
//    @Bean
//    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http)
//            throws Exception {
//        http
//                .authorizeHttpRequests((authorize) -> authorize
//                        .requestMatchers("/products").hasAuthority("mentor")
//                        .requestMatchers("/products/{id}").authenticated()
//                        .anyRequest().permitAll()
//                )
//                .oauth2ResourceServer((oauth2) -> oauth2.jwt(
//                        jwtConfigurer -> {
//                            jwtConfigurer.jwtAuthenticationConverter(new CustomJwtAuthenticationConverter());
//                        }
//                ))
//        // Form login handles the redirect to the login page from the
//        // authorization server filter chain
//        ;
//
//        return http.build();
//    }
}
