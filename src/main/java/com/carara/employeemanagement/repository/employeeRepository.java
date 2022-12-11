package com.carara.employeemanagement.repository;

import com.carara.employeemanagement.domain.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<Employee, Long> {
}
