package com.liuwei.designpattern.template.example1;

/**
 * @author liuwei2
 */
public class Client {

    public static void main(String[] args) {
        BaseAccount account = new CurrentAccount();
        account.handle("VV", "12345");

        account = new SavingAccount();
        account.handle("VV", "12345");

    }
}
