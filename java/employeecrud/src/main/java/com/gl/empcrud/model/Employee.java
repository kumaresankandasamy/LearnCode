package com.gl.empcrud.model;

import javax.persistence.*;
import javax.annotation.Generated;
import java.beans.Transient;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee implements Serializable, Comparable<Employee> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private long empId;
    @Column(name = "emp_name",nullable= false)
    private String name;
    @Column(name = "dept_name")
    private String department;
    @Column(name = "emp_age")
    private int age;
    @Column(name = "emp_dob")
    private LocalDate dateOfBirth;
    @OneToMany(mappedBy = "employee",cascade= CascadeType.ALL)
    private Set<Dependent> dependentSet = new HashSet<Dependent>();
    @OneToOne(mappedBy = "employee",cascade= CascadeType.ALL)
    private Address address;
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
        address.setEmployee();
    }

    public Set<Dependent> getDependentSet() {
        return dependentSet;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public void setDependentSet(Set<Dependent> dependentSet) {
        this.dependentSet = dependentSet;
    }

    public long getEmpId() {
        return empId;
    }

    private Employee(){}

    public Employee(long empId){
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name);
    }

    @Override
    public int compareTo(Employee employee) {
        return (int)(this.empId - employee.empId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

}
