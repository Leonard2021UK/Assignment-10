package com.codercampus.mealplannerapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class WeekDto {
    private DayResponseDto monday;
    private DayResponseDto tuesday;
    private DayResponseDto wednesday;
    private DayResponseDto thursday;
    private DayResponseDto friday;
    private DayResponseDto saturday;
    private DayResponseDto sunday;

    public DayResponseDto getMonday() {
        return monday;
    }

    public void setMonday(DayResponseDto monday) {
        this.monday = monday;
    }

    public DayResponseDto getTuesday() {
        return tuesday;
    }

    public void setTuesday(DayResponseDto tuesday) {
        this.tuesday = tuesday;
    }

    public DayResponseDto getWednesday() {
        return wednesday;
    }

    public void setWednesday(DayResponseDto wednesday) {
        this.wednesday = wednesday;
    }

    public DayResponseDto getThursday() {
        return thursday;
    }

    public void setThursday(DayResponseDto thursday) {
        this.thursday = thursday;
    }

    public DayResponseDto getFriday() {
        return friday;
    }

    public void setFriday(DayResponseDto friday) {
        this.friday = friday;
    }

    public DayResponseDto getSaturday() {
        return saturday;
    }

    public void setSaturday(DayResponseDto saturday) {
        this.saturday = saturday;
    }

    public DayResponseDto getSunday() {
        return sunday;
    }

    public void setSunday(DayResponseDto sunday) {
        this.sunday = sunday;
    }
}
