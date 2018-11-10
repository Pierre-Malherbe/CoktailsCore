package com.malherbe.cocktailcore.resource.model.repository;

import com.malherbe.cocktailcore.resource.model.entity.CocktailEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocktailRepository extends CrudRepository<CocktailEntity, Long> {

}
