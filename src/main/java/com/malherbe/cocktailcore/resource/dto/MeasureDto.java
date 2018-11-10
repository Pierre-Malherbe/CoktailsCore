package com.malherbe.cocktailcore.resource.dto;

import java.util.List;

public class MeasureDto {

    private Long id;

    private Integer volume;

    private DrinkDto drink;

    private List<CocktailDto> cocktailEntityList;

    public Long getId() {
        return id;
    }

    public MeasureDto setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getVolume() {
        return volume;
    }

    public MeasureDto setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }

    public DrinkDto getDrink() {
        return drink;
    }

    public MeasureDto setDrink(DrinkDto drink) {
        this.drink = drink;
        return this;
    }

    public List<CocktailDto> getCocktailEntityList() {
        return cocktailEntityList;
    }

    public MeasureDto setCocktailEntityList(List<CocktailDto> cocktailEntityList) {
        this.cocktailEntityList = cocktailEntityList;
        return this;
    }
}
