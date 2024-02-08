package com.backend.aviation.mapper;


import com.backend.aviation.dto.TestDTO;
import com.backend.aviation.dto.TestDTOSave;
import com.backend.aviation.model.Test;

public interface Interface {
    TestDTO mapToDTO(Test test);
    Test mapToEntity(TestDTOSave testDTO);
}

