package com.swipy.model.repository;

import com.swipy.model.entity.AddressType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AddressTypeRepository extends CrudRepository<AddressType, UUID> {
}
