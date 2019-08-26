package com.gl.empcrud.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Set;

public class Project {
    //@Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;
    private String name;
    private LocalDate startDate;
    private Set<Employee> employeeSet;
}
