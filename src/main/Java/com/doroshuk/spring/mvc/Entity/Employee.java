package com.doroshuk.spring.mvc.Entity;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String ,String >mapDepartments;

    public Employee() {
        mapDepartments = new HashMap<>();
        mapDepartments.put("Informate technologi","IT");
        mapDepartments.put("Head hunter","HH");
        mapDepartments.put("Sales technologi","Sales ");

    }

    public Employee(String name, String surname, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    public Map<String, String> getMapDepartments() {
        return mapDepartments;
    }

    public void setMapDepartments(Map<String, String> mapDepartments) {
        this.mapDepartments = mapDepartments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
