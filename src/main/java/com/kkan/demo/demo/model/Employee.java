package com.kkan.demo.demo.model;

public class Employee {

    private String id;
    private String name;
    private String email;
    private String spec;

    public Employee(String id, String name, String email, String spec) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.spec = spec;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", spec='" + spec + '\'' +
                '}';
    }
}
