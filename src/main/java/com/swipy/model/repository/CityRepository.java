package com.swipy.model.repository;

import com.swipy.model.entity.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CityRepository extends CrudRepository<City, UUID> {
}