package com.malherbe.cocktailcore.resource.model.repository;


import com.malherbe.cocktailcore.resource.model.entity.MeasureEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasureRepository extends CrudRepository<MeasureEntity, Long> {

}
