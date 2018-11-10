package com.malherbe.cocktailcore.resource.dto;

import java.util.List;

public class DrinkDto {

    private Long id;

    private String name;

    private String picture;

    private Double capacity;

    private Double remainingCapacity;

    private Integer pin;

    private List<MeasureDto> measureEntityList;

    public Long getId() {
        return id;
    }

    public DrinkDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DrinkDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getPicture() {
        return picture;
    }

    public DrinkDto setPicture(String picture) {
        this.picture = picture;
        return this;
    }

    public Double getCapacity() {
        return capacity;
    }

    public DrinkDto setCapacity(Double capacity) {
        this.capacity = capacity;
        return this;
    }

    public Double getRemainingCapacity() {
        return remainingCapacity;
    }

    public DrinkDto setRemainingCapacity(Double remainingCapacity) {
        this.remainingCapacity = remainingCapacity;
        return this;
    }

    public Integer getPin() {
        return pin;
    }

    public DrinkDto setPin(Integer pin) {
        this.pin = pin;
        return this;
    }

    public List<MeasureDto> getMeasureEntityList() {
        return measureEntityList;
    }

    public DrinkDto setMeasureEntityList(List<MeasureDto> measureEntityList) {
        this.measureEntityList = measureEntityList;
        return this;
    }
}
