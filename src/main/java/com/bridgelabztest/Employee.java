package com.bridgelabztest;

import com.opencsv.bean.CsvBindByName;

public class Employee{

    private String ID;

    private String Name;


    private String Department;

    private String Salary;

    public Employee() {}
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
