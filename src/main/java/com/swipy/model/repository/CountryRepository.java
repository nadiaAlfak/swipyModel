package com.swipy.model.repository;

import com.swipy.model.entity.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CountryRepository extends CrudRepository<Country, UUID> {
}
