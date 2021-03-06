package com.codercampus.mealplannerapp.controllers;

import com.codercampus.mealplannerapp.dto.DayResponseDto;
import com.codercampus.mealplannerapp.dto.WeekResponseDto;
import com.codercampus.mealplannerapp.service.SpoonacularRestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MealPlannerController {

    SpoonacularRestService spoonacularRestService;

    public MealPlannerController(SpoonacularRestService spoonacularRestService){
        this.spoonacularRestService = spoonacularRestService;
    }

    @GetMapping("mealplanner/week")
    public ResponseEntity<?> getWeekMeals(String numCalories, String diet, String exclusions) {

        Map<String,String> queryParams = new HashMap<>();
        queryParams.put("timeFrame","week");
        queryParams.put("numCalories",numCalories);
        queryParams.put("diet",diet);
        queryParams.put("exclusion",exclusions);

        return spoonacularRestService.getResource(queryParams,WeekResponseDto.class);
    }

    @GetMapping("mealplanner/day")
    public ResponseEntity<?> getDayMeals(String numCalories, String diet, String exclusions) {

        Map<String,String> queryParams = new HashMap<>();
        queryParams.put("timeFrame","day");
        queryParams.put("numCalories",numCalories);
        queryParams.put("diet",diet);
        queryParams.put("exclusion",exclusions);

        return spoonacularRestService.getResource(queryParams,DayResponseDto.class);
    }
}
