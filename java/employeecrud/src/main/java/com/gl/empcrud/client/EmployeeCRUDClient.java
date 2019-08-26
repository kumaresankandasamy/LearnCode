package com.gl.empcrud.client;

import com.gl.empcrud.controller.EmployeeController;
import com.gl.empcrud.model.Address;
import com.gl.empcrud.model.Dependent;
import com.gl.empcrud.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

public class EmployeeCRUDClient {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        EmployeeController employeeController = applicationContext.getBean(EmployeeController.class);
        Employee employee = new Employee(1);
        employee.setName("ram");
        employee.setAge(24);
        employee.setDateOfBirth(LocalDate.of(1,1990,4));
        employee.setDepartment("Financial");

        Dependent mother = new Dependent();
        mother.setName("seetha");
        mother.setAge(50);
        mother.setRelationship("mother");

        Dependent father = new Dependent();
        father.setName("raman");
        father.setAge(60);
        father.setRelationship("father");

        Address address = new Address();
        address.setCity("Bangalore");
        address.setState("Karnataka");
        address.setZipcode("123456");

        employee.setAddress(address);
        employeeController.saveEmployee(employee);

    }
}
