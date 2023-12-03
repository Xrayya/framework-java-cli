package com.Project.Models;

import com.core.Model.Model;

/**
 * Employee
 */
public class Employee extends Model {

    private String name;

    public Employee() {
        this.fileName = "employee";
    }

    public Employee(Long id, String name) {
        super(id);
        this.name = name;
        this.fileName = "employee";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
