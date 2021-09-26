package com.codercampus.mealplannerapp.dto;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DayResponseDto {
    List<MealDto> meals;
    NutrientsDto nutrients;

    public List<MealDto> getMeals() {
        return meals;
    }

    public void setMeals(List<MealDto> meals) {
        this.meals = meals;
    }

    public NutrientsDto getNutrients() {
        return nutrients;
    }

    public void setNutrients(NutrientsDto nutrients) {
        this.nutrients = nutrients;
    }
}
