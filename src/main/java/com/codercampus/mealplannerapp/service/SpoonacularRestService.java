package com.codercampus.mealplannerapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

@Service
public class SpoonacularRestService {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${spoonacular.urls.base}")
    private String baseUrl;

    @Value("${spoonacular.urls.mealplan}")
    private String mealplan;

    @Value("${spoonacular.tokens.apiKey}")
    private String apiKey;

    public <T> ResponseEntity<T> getResource(Map<String,String> queryParams,Class<T> responseDto) {

        URI uri = UriComponentsBuilder.fromHttpUrl(this.baseUrl + mealplan)
                .queryParam("timeFrame",queryParams.get("timeFrame"))
                .queryParam("apiKey",this.apiKey)
                .queryParam("numCalories",queryParams.get("numCalories"))
                .queryParam("diet",queryParams.get("diet"))
                .queryParam("exclusion",queryParams.get("exclusion"))
                .build().toUri();

        return restTemplate.getForEntity(uri, responseDto);

    }
}
