package com.swipy.model.repository;

import com.swipy.model.entity.AccExpensis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccExpensisRepository extends CrudRepository<AccExpensis, UUID> {
}
