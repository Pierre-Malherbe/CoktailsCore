package com.malherbe.cocktailcore.resource.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "drink")
public class DrinkEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "picture")
    private String picture;

    @Column(name = "capacity")
    private Double capacity;

    @Column(name = "remaining_capacity")
    private Double remainingCapacity;

    @Column(name = "pin")
    private Integer pin;

    @OneToMany(mappedBy = "drink", cascade = CascadeType.ALL)
    private List<MeasureEntity> measureEntityList;

    public Long getId() {
        return id;
    }

    public DrinkEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DrinkEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getPicture() {
        return picture;
    }

    public DrinkEntity setPicture(String picture) {
        this.picture = picture;
        return this;
    }

    public Double getCapacity() {
        return capacity;
    }

    public DrinkEntity setCapacity(Double capacity) {
        this.capacity = capacity;
        return this;
    }

    public Double getRemainingCapacity() {
        return remainingCapacity;
    }

    public DrinkEntity setRemainingCapacity(Double remainingCapacity) {
        this.remainingCapacity = remainingCapacity;
        return this;
    }

    public Integer getPin() {
        return pin;
    }

    public DrinkEntity setPin(Integer pin) {
        this.pin = pin;
        return this;
    }

    public List<MeasureEntity> getMeasureEntityList() {
        return measureEntityList;
    }

    public DrinkEntity setMeasureEntityList(List<MeasureEntity> measureEntityList) {
        this.measureEntityList = measureEntityList;
        return this;
    }
}
