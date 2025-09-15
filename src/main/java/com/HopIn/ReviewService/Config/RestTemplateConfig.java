package com.HopIn.ReviewService.Config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder
                .connectTimeout(Duration.ofSeconds(5)) //max wait for connection
                .readTimeout(Duration.ofSeconds(5)).build(); //max wait for response
    }

}
