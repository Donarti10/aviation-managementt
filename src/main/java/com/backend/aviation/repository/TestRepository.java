package com.backend.aviation.repository;

import com.backend.aviation.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, String> {

    List<Test> findByName(String name);
}
