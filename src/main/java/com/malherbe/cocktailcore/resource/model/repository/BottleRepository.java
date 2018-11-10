package com.malherbe.cocktailcore.resource.model.repository;

import com.malherbe.cocktailcore.resource.model.entity.BottleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BottleRepository extends CrudRepository<BottleEntity, Long> {

        }