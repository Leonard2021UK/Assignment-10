package com.codercampus.mealplannerapp.dto;

import org.springframework.stereotype.Component;

@Component
public class WeekResponseDto {
    private WeekDto week;

    public WeekDto getWeek() {
        return week;
    }

    public void setWeek(WeekDto week) {
        this.week = week;
    }
}
