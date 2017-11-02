package com.liuwei.designpattern.state.example1;

/**
 * @author liuwei2
 */
public abstract class AccountState {
    protected Account account;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract boolean stateCheck();
}
