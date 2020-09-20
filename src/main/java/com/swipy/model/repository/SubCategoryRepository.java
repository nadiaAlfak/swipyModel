package com.swipy.model.repository;

import com.swipy.model.entity.SubCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SubCategoryRepository extends CrudRepository<SubCategory, UUID> {
}
