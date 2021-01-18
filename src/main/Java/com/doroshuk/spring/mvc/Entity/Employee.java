package com.doroshuk.spring.mvc.Entity;


import com.doroshuk.spring.mvc.validator.ChekEmailAnnotation;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2,message = "min 2 chars")
    private String name;
    @NotBlank(message = "@NotEmpty + не могут быть тольео пробелы")
    private String surname;

    @Min(value = 500, message = "you salary mast be more that 499")
    @Max(value = 1000, message = "you salary mast be less that 1001")
    private int salary;
    private String department;
    private Map<String, String> mapDepartments;
    private String markAuto;
    private Map<String, String> mapOfCars;
    private String[] langviches;
    private Map<String, String> mapLangviches;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please write your number at this method : XXX-XX-XX")
    private String phoneNumber;

    //созданная нами А
    @ChekEmailAnnotation(value = "xyz.com",message = "Email must be ended with xyz.com")
    private String eMail;

    public Employee() {
        mapDepartments = new HashMap<>();
        mapDepartments.put("Information technology", "IT");
        mapDepartments.put("Head hunter", "HH");
        mapDepartments.put("Sales technology", "Sales ");

        mapOfCars = new HashMap<>();
        mapOfCars.put("BMW", "BMW");
        mapOfCars.put("WV", "WV");
        mapOfCars.put("MB", "MB");

        mapLangviches = new HashMap<>();
        mapLangviches.put("English", "Eng");
        mapLangviches.put("Polish", "Pol");
        mapLangviches.put("French", "Fr");
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
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
