package com.doroshuk.spring.mvc.Entity;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String ,String >mapDepartments;
    private String markAuto;
    private Map<String,String  >mapOfCars;
    private String[]  langviches;
    private Map<String ,String >mapLangviches;

    public Employee() {
        mapDepartments = new HashMap<>();
        mapDepartments.put("Information technology","IT");
        mapDepartments.put("Head hunter","HH");
        mapDepartments.put("Sales technology","Sales ");

        mapOfCars =new HashMap<>();
        mapOfCars.put("BMW","BMW");
        mapOfCars.put("WV","WV");
        mapOfCars.put("MB","MB");

        mapLangviches = new HashMap<>();
        mapLangviches.put("English","Eng");
        mapLangviches.put("Polish","Pol");
        mapLangviches.put("French","Fr");
    }

    public Employee(String name, String surname, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    public Map<String, String> getMapLangviches() {
        return mapLangviches;
    }

    public void setMapLangviches(Map<String, String> mapLangviches) {
        this.mapLangviches = mapLangviches;
    }

    public String[] getLangviches() {
        return langviches;
    }

    public void setLangviches(String[] langviches) {
        this.langviches = langviches;
    }

    public Map<String, String> getMapOfCars() {
        return mapOfCars;
    }

    public void setMapOfCars(Map<String, String> mapOfCars) {
        this.mapOfCars = mapOfCars;
    }

    public String getMarkAuto() {
        return markAuto;
    }

    public void setMarkAuto(String markAuto) {
        this.markAuto = markAuto;
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
