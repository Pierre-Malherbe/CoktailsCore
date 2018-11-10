package com.malherbe.cocktailcore.resource.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "measure")
public class MeasureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "volume")
    private Integer volume;

    @ManyToOne
    @JoinColumn(name = "drink_id")
    private DrinkEntity drink;

    @ManyToMany(mappedBy = "measures")
    private List<CocktailEntity> cocktailEntityList;

    public Long getId() {
        return id;
    }

    public MeasureEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getVolume() {
        return volume;
    }

    public MeasureEntity setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }

    public DrinkEntity getDrink() {
        return drink;
    }

    public MeasureEntity setDrink(DrinkEntity drink) {
        this.drink = drink;
        return this;
    }

    public List<CocktailEntity> getCocktailEntityList() {
        return cocktailEntityList;
    }

    public MeasureEntity setCocktailEntityList(List<CocktailEntity> cocktailEntityList) {
        this.cocktailEntityList = cocktailEntityList;
        return this;
    }
}
