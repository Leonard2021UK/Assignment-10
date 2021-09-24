package com.codercampus.mealplannerapp.controllers;

import com.codercampus.mealplannerapp.dto.DayResponseDto;
import com.codercampus.mealplannerapp.dto.WeekResponseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class MealPlannerController {

    @Value("${spoonacular.urls.base}")
    private String baseUrl;

    @Value("spoonacular.urls.mealplan")
    private String mealplan;

    @Value("${poonacular.tokens.apiKey}")
    private String apiKey;

    @GetMapping("mealplanner/week")
    public ResponseEntity<WeekResponseDto> getWeekMeals(String numCalories, String diet, String exclusions){

        RestTemplate restTemplate = new RestTemplate();
        URI uri = UriComponentsBuilder.fromHttpUrl(this.baseUrl + mealplan)
                .queryParam("timeFrame","week")
                .queryParam(this.apiKey)
                .queryParam("numCalories",numCalories)
                .queryParam("diet",diet)
                .queryParam("exclusion",exclusions)
                .build().toUri();
        return restTemplate.getForEntity(uri, WeekResponseDto.class);
    }

    @GetMapping("mealplanner/day")
    public ResponseEntity<DayResponseDto> getDayMeals(String numCalories, String diet, String exclusions){
        RestTemplate restTemplate = new RestTemplate();
        URI uri = UriComponentsBuilder.fromHttpUrl(this.baseUrl + mealplan)
                .queryParam("timeFrame","day")
                .queryParam("apiKey","0149b69cd3e34699a310f9e63bb0634b")
                .queryParam("numCalories",numCalories)
                .queryParam("diet",diet)
                .queryParam("exclusion",exclusions)
                .build().toUri();
        return restTemplate.getForEntity(uri,DayResponseDto.class);
    }
}
