package com.swipy.model.repository;

import com.swipy.model.entity.Media;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MediaRepository extends CrudRepository<Media, UUID> {
}
