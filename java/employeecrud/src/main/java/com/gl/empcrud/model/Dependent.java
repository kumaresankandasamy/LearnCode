package com.gl.empcrud.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dependents")
public class Dependent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String relationship;
    private int age;
    @ManyToOne
    @JoinColumn(name = "emp_id",nullable = false)
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Dependent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", relationship='" + relationship + '\'' +
                ", age=" + age +
                ", employee=" + employee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dependent dependent = (Dependent) o;
        return id == dependent.id &&
                age == dependent.age &&
                Objects.equals(name, dependent.name) &&
                Objects.equals(relationship, dependent.relationship) &&
                Objects.equals(employee, dependent.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, relationship, age, employee);
    }

}
