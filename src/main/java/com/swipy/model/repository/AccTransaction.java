package com.swipy.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccTransaction extends CrudRepository<AccTransaction, UUID> {
}
