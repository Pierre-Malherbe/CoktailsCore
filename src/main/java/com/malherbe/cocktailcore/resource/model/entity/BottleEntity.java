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

    @Column(name = "firstname")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
