package com.malherbe.cocktailcore.resource.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cocktail")
public class CocktailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "picture")
    private String picture;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Measure_Drinks",
            joinColumns = { @JoinColumn(name = "cocktail_id") },
            inverseJoinColumns = { @JoinColumn(name = "measure_id") }
    )
    private List<MeasureEntity> measures;

    public Long getId() {
        return id;
    }

    public CocktailEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CocktailEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getPicture() {
        return picture;
    }

    public CocktailEntity setPicture(String picture) {
        this.picture = picture;
        return this;
    }

    public List<MeasureEntity> getMeasures() {
        return measures;
    }

    public CocktailEntity setMeasures(List<MeasureEntity> measures) {
        this.measures = measures;
        return this;
    }
}
