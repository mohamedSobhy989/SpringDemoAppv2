package com.spring.appdemo;


/*
* this is test class used for learning injection
* this class injected by application context on bean xml
* using Getter and Setter Injection
* */
public class Employee {

    private String name ;
    private int age;
    private int salary;
    private String position;
    private Department department;


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String printName(){
        return "Mohamed Sobhy";
    }
}
