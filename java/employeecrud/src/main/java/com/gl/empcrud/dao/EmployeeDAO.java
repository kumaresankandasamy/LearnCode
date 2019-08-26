package com.gl.empcrud.dao;

import com.gl.empcrud.model.Employee;

import java.util.Optional;
import java.util.Set;

public interface EmployeeDAO {
    Employee saveEmployee(Employee employee);
    Set<Employee> listAllEmployee();
    Optional<Employee> findById(long id);
    void deleteEmployee(long id);
    Employee updateEmployee(long id,Employee employee);
}
