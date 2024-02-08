package com.backend.aviation.services;

import com.backend.aviation.dto.CommonResponseDTO;
import com.backend.aviation.dto.TestDTO;
import com.backend.aviation.dto.TestDTOSave;
import com.backend.aviation.model.Test;

import java.util.List;
import java.util.Map;

public interface TestService {
    CommonResponseDTO<TestDTO> getAllTests(int pageNo, int pageSize, String sortBy, String sortDirection);
    TestDTO saveTest(TestDTOSave testDTO);
    Test findTestById(String id);
    Test deleteTest(String id);
    TestDTO updateTest(String id,TestDTOSave testDTO);


}

