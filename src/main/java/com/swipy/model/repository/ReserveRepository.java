package com.swipy.model.repository;

import com.swipy.model.entity.Reserve;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReserveRepository extends CrudRepository<Reserve, UUID> {
}
