package com.swipy.model.repository;

import com.swipy.model.entity.State;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StateRepository extends CrudRepository<State, UUID> {
}
