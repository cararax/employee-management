package com.carara.employeemanagement.resource;

import com.carara.employeemanagement.domain.entity.Employee;
import com.carara.employeemanagement.domain.request.EmployeeRequest;
import com.carara.employeemanagement.domain.response.EmployeeResponse;
import com.carara.employeemanagement.mapper.EmployeeMapper;
import com.carara.employeemanagement.repository.EmployeeRepository;
import com.carara.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees")
public class EmployeeResource extends AbstractResource<Employee, EmployeeResponse, EmployeeRequest, Long, EmployeeMapper, EmployeeRepository, com.carara.employeemanagement.service.EmployeeService> {

    @Autowired
    public EmployeeResource(EmployeeService service) {
        super(service);
    }
}