package com.liuwei.designpattern.prototype.address;

public class Customer implements Cloneable {
    private int id;
    private String name;
    private String telNumber;
    private Address address;

    public Customer() {
        this.id = 1001;
        this.name = "eric";
        this.telNumber = "18108450001";
        this.address = new Address(61000, "TD.Street");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Customer clone() throws CloneNotSupportedException {
        return (Customer)super.clone();
    }

    public Customer deepClone() throws CloneNotSupportedException {
        Address address1 = new Address(address.getNumber(), address.getStreet());
        Customer customer = (Customer)super.clone();
        customer.setAddress(address1);
        return customer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", address=" + address +
                '}';
    }
}
