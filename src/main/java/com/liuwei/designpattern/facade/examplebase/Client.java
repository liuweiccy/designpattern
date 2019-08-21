package com.liuwei.designpattern.facade.examplebase;

public class Client {
    public static void main(String[] args) {
        EncryptFacade facade = new EncryptFacade();
        facade.encrypt("a.txt", "b.txt");

        System.out.println("------------------------------------------- ");

        AbstractEncryFacade facade1 = new NewEncryptFacade();
        facade1.encrypt("a.txt", "b.txt");
    }
}
