package com.liuwei.designpattern.state.example1;

/**
 * @author liuwei2
 */
public class Client {
    public static void main(String[] args) {
        Account account = new Account("VV", 0);
        account.deposit(1000);
        account.withdraw(5000);
        account.deposit(3000);
        account.withdraw(4000);
        account.deposit(3000);
        account.withdraw(1000);
        account.withdraw(2000);
        account.withdraw(2000);
        account.withdraw(2000);
        account.computeInterest();
    }
}
