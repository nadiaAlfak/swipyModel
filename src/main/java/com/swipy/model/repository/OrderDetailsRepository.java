package com.swipy.model.repository;

import com.swipy.model.entity.OrderDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderDetailsRepository extends CrudRepository<OrderDetails, UUID> {
}
