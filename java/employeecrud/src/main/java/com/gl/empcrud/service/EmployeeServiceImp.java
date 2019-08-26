package com.gl.empcrud.service;

import com.gl.empcrud.model.Employee;
import com.gl.empcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public EmployeeService saveEmployee(Employee employee) {
        return (EmployeeService) this.employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> findById(long empId) {
        return this.employeeRepository.findById(empId);
    }

    @Override
    @Transactional
    public Set<Employee> listAllEmployee() {
        Set<Employee> employeeSet = new HashSet<>();
        this.employeeRepository.findAll().forEach(employee -> {
            employeeSet.add(employee);
        });
        return employeeSet;
    }

    @Override
    @Transactional
    public void deleteEmployee(long empId) {
        Optional<Employee> employeeOptional = this.employeeRepository.findById(empId);
        employeeOptional.ifPresent(employee -> {
            employeeRepository.delete(employee);
        });

    }

    @Override
    public Employee updateEmployee(long empId, Employee employee) {
        return this.employeeRepository.save(employee);
    }
}
