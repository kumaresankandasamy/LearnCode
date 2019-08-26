package com.gl.empcrud.dao;

import com.gl.empcrud.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.*;

public class EmployeeDAOImp implements EmployeeDAO {
    private SessionFactory sessionFactory;
    @Override
    public Employee saveEmployee(Employee employee) {
        Session currentSession = this.sessionFactory.getCurrentSession();
        currentSession.save(employee);
        return employee;
    }

    @Override
    public Set<Employee> listAllEmployee() {
        Session currentSession = this.sessionFactory.getCurrentSession();
        List employees = currentSession.createQuery("From Employee").list();
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.addAll(employees);
        return employeeSet;
    }

    @Override
    public Optional<Employee> findById(long id) {
        Session currentSession = this.sessionFactory.getCurrentSession();
        Employee employee = currentSession.find(Employee.class,id);
        return Optional.ofNullable(employee);
    }

    @Override
    public void deleteEmployee(long id) {
        Session currentSession = this.sessionFactory.getCurrentSession();
        Employee employee = currentSession.find(Employee.class, id);
        if (Objects.nonNull(employee)) {
            currentSession.delete(employee);
        }
    }

    @Override
    public Employee updateEmployee(long id, Employee employee) {
        Session currentSession = this.sessionFactory.getCurrentSession();
        Employee empFromDB = currentSession.find(Employee.class,id);
        if (Objects.nonNull(empFromDB)){
            empFromDB.setName(employee.getName());
            empFromDB.setDepartment(employee.getDepartment());
            empFromDB.setDateOfBirth(employee.getDateOfBirth());
            empFromDB.setAge(employee.getAge());
            empFromDB.setAddress(employee.getAddress());
        }
        return empFromDB;
    }
}
