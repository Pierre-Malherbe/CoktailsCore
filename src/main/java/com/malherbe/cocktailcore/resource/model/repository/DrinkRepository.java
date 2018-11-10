package com.malherbe.cocktailcore.resource.model.repository;

import com.malherbe.cocktailcore.resource.model.entity.DrinkEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends CrudRepository<DrinkEntity, Long> {

        }