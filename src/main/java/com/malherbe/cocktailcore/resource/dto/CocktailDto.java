package com.malherbe.cocktailcore.resource.dto;

import java.util.List;

public class CocktailDto {

    private Long id;

    private String name;

    private String picture;

    private List<MeasureDto> measures;

    public Long getId() {
        return id;
    }

    public CocktailDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CocktailDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getPicture() {
        return picture;
    }

    public CocktailDto setPicture(String picture) {
        this.picture = picture;
        return this;
    }

    public List<MeasureDto> getMeasures() {
        return measures;
    }

    public CocktailDto setMeasures(List<MeasureDto> measures) {
        this.measures = measures;
        return this;
    }
}
