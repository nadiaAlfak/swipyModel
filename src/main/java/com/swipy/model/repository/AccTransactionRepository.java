package com.swipy.model.repository;

import com.swipy.model.entity.AccTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccTransactionRepository extends CrudRepository<AccTransaction, UUID> {
}
