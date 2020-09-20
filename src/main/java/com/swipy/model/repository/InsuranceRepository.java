package com.swipy.model.repository;

import com.swipy.model.entity.Insurance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface InsuranceRepository extends CrudRepository<Insurance, UUID> {
}
