package com.gl.empcrud.controller;

import com.gl.empcrud.model.Employee;
import com.gl.empcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    public EmployeeService saveEmployee(Employee employee){
        return employeeService.saveEmployee(employee);
    }
    public Set<Employee> listAllEmployee(){
        return this.employeeService.listAllEmployee();
    }
    public Employee fetchEmployeeId(long empId){
        return null;
    }
    public Employee deleteEmployee(long empId){
        return  null;
    }
    public Employee updateEmployee(long EmpId,Employee employee){
        return null;
    }
}
