package com.swipy.model.repository;

import com.swipy.model.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {
    User findByFirstName(String key);
    User findByLastName(String key);
    @Override
    Optional<User> findById(UUID key);
}
