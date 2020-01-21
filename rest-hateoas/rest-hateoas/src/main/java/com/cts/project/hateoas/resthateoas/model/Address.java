package com.cts.project.hateoas.resthateoas.model;

public class Address {


    private int flatNo;
    private String address;

    public Address(int flatNo, String address) {
        this.flatNo = flatNo;
        this.address = address;
    }

    public Address() {

    }

    public int getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flatNo=" + flatNo +
                ", address='" + address + '\'' +
                '}';
    }
}
