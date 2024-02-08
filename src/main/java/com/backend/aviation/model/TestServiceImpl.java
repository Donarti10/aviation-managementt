package com.backend.aviation.model;

import com.backend.aviation.dto.CommonResponseDTO;
import com.backend.aviation.dto.TestDTO;
import com.backend.aviation.dto.TestDTOSave;
import com.backend.aviation.mapper.TestMapper;
import com.backend.aviation.repository.TestRepository;
import com.backend.aviation.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;
    private final TestMapper testMapper;

    @Autowired
    public TestServiceImpl(TestRepository testRepository, TestMapper testMapper) {
        this.testRepository = testRepository;
        this.testMapper = testMapper;
    }

    public TestDTO getTestById(String id) {
        Test test = testRepository.findById(id).orElse(null);
        return test != null ? testMapper.mapToDTO(test) : null;
    }

    public List<TestDTO> getAllTests() {
        List<Test> tests = testRepository.findAll();
        return tests.stream().map(testMapper::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public CommonResponseDTO<TestDTO> getAllTests(int pageNo, int pageSize, String sortBy, String sortDirection) {
        return null;
    }

    public TestDTO saveTest(TestDTOSave testDTO) {
        Test test = testMapper.mapToEntity(testDTO);
        testRepository.save(test);
        return null;
    }

    @Override
    public Test findTestById(String id) {
        return null;
    }

    @Override
    public Test deleteTest(String id) {
        return null;
    }

    @Override
    public TestDTO updateTest(String id, TestDTOSave testDTO) {
        return null;
    }

    public List<TestDTO> getTestsByName(String name) {
        List<Test> tests = testRepository.findByName(name);
        return tests.stream().map(testMapper::mapToDTO).collect(Collectors.toList());
    }
}