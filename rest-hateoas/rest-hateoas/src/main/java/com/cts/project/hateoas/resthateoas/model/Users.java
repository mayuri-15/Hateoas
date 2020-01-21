package com.cts.project.hateoas.resthateoas.model;
import org.springframework.hateoas.ResourceSupport;

public class Users extends ResourceSupport {
    private String name;
    private int age;

    public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    private Address address1;

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
