package com.backend.aviation.model;

import com.backend.aviation.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryInterface extends JpaRepository<Test, String> {
    // You can add custom query methods here if needed

    // Example custom query method to find tests by name
    List<Test> findByName(String name);
}