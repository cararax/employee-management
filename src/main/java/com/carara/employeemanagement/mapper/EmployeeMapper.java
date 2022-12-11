package com.carara.employeemanagement.mapper;

import com.carara.employeemanagement.domain.entity.Employee;
import com.carara.employeemanagement.domain.request.EmployeeRequest;
import com.carara.employeemanagement.domain.response.EmployeeResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper extends AbstractMapper<Employee, EmployeeResponse, EmployeeRequest> {
}
