package com.swipy.model.repository;

import com.swipy.model.entity.LogActivityType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LogActivityTypeRepository extends CrudRepository<LogActivityType, UUID> {
}
