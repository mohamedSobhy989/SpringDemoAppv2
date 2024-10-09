package com.spring.appdemo;

import java.util.List;

/*
 * this is test class used for learning injection
 * this class injected by application context on bean xml
 * using Constructor Injection
 * */
public class Department {

    private Long id;
    private String name;
    private List<Addresses> address;

    public Department(Long id, String name, List<Addresses> address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Addresses> getAddress() {
        return address;
    }

    public void setAddress(List<Addresses> address) {
        this.address = address;
    }
}
