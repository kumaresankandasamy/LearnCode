package com.gl.empcrud.service;

import com.gl.empcrud.model.Employee;

import java.util.Optional;
import java.util.Set;

public interface EmployeeService {
    EmployeeService saveEmployee(Employee employee);
    Optional<Employee> findById(long empId);
    Set<Employee> listAllEmployee();
    void deleteEmployee(long empId);
    Employee updateEmployee(long empId,Employee employee);

}
