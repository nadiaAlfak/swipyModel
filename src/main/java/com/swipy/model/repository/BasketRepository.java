package com.swipy.model.repository;

import com.swipy.model.entity.Basket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BasketRepository extends CrudRepository<Basket, UUID> {
}
