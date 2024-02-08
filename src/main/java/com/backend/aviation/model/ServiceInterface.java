package com.backend.aviation.model;

import com.backend.aviation.dto.TestDTO;
import com.backend.aviation.dto.TestDTOSave;

import java.util.List;

public interface ServiceInterface {
    TestDTO getTestById(String id);
    List<TestDTO> getAllTests();
    void saveTest(TestDTOSave testDTO);
    List<TestDTO> getTestsByName(String name);
    // Add other service methods as needed
}