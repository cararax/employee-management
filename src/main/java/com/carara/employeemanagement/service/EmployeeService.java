package com.carara.employeemanagement.service;

import com.carara.employeemanagement.domain.entity.Employee;
import com.carara.employeemanagement.domain.request.EmployeeRequest;
import com.carara.employeemanagement.domain.response.EmployeeResponse;
import com.carara.employeemanagement.mapper.EmployeeMapper;
import com.carara.employeemanagement.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService extends AbstractService
        <Employee, EmployeeResponse, EmployeeRequest, Long, EmployeeMapper, EmployeeRepository> {
    public EmployeeService(EmployeeRepository repository, EmployeeMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public List<EmployeeResponse> findAll() {
        return super.findAll();
    }

}
