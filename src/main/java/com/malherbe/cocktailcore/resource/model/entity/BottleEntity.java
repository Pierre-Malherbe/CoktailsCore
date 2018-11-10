package com.malherbe.cocktailcore.resource.model.entity;

import javax.persistence.*;
import java.io.Serializable;

;

@Entity
@Table(name = "c_Bottle")
public class BottleEntity implements Serializable {

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

    public Long getId() {
        return id;
    }

    public BottleEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BottleEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getPicture() {
        return picture;
    }

    public BottleEntity setPicture(String picture) {
        this.picture = picture;
        return this;
    }

    public Double getCapacity() {
        return capacity;
    }

    public BottleEntity setCapacity(Double capacity) {
        this.capacity = capacity;
        return this;
    }

    public Double getRemainingCapacity() {
        return remainingCapacity;
    }

    public BottleEntity setRemainingCapacity(Double remainingCapacity) {
        this.remainingCapacity = remainingCapacity;
        return this;
    }

    public Integer getPin() {
        return pin;
    }

    public BottleEntity setPin(Integer pin) {
        this.pin = pin;
        return this;
    }
}
