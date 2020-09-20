package com.swipy.model.repository;

import com.swipy.model.entity.Support;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SupportRepository extends CrudRepository<Support, UUID> {
}
