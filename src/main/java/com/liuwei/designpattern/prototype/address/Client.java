package com.liuwei.designpattern.prototype.address;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Customer customer = new Customer();
        Customer customer1 = customer.clone();
        Customer customer2 = customer.deepClone();

        System.out.println(customer == customer1);
        System.out.println(customer.getAddress() == customer1.getAddress());

        System.out.println(customer == customer2);
        System.out.println(customer.getAddress() == customer2.getAddress());

        System.out.println(customer);
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
