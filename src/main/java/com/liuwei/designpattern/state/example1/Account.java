package com.liuwei.designpattern.state.example1;

import lombok.Getter;
import lombok.Setter;

/**
 * @author liuwei2
 */
public class Account {
    @Setter
    private AccountState state;
    private String owner;
    @Setter @Getter
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.state = new NormalState(this);
        System.out.println(this.owner + "开户，初始的金额为" + balance);
        System.out.println("--------------------------------------------");
    }

    public void deposit(double amount) {
        System.out.println(this.owner + "存款" + amount);
        state.deposit(amount);
        System.out.println("当前的金额为" + this.balance);
        System.out.println("现在账户的状态为" + this.state.getClass().getName());
        System.out.println("--------------------------------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner + "取款" + amount);
        state.withdraw(amount);
        System.out.println("当前的金额为" + this.balance);
        System.out.println("现在账户的状态为" + this.state.getClass().getName());
        System.out.println("--------------------------------------------");
    }

    public void computeInterest() {
        state.computeInterest();
    }
}
