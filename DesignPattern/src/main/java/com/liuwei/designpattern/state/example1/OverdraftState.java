package com.liuwei.designpattern.state.example1;

/**
 * 透支状态
 * @author liuwei2
 */
public class OverdraftState extends AccountState {
    public OverdraftState(Account account) {
        this.account = account;
    }

    public OverdraftState(AccountState state) {
        this.account = state.account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        if (!stateCheck()) {
            account.setBalance(account.getBalance() + amount);
        }
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息");
    }

    @Override
    public boolean stateCheck() {
        if (account.getBalance() >= 0) {
            account.setState(new NormalState(this));
            return true;
        } else if (account.getBalance() == -2000) {
            account.setState(new RestrictedState(this));
            return true;
        } else if (account.getBalance() < -2000) {
            System.out.println("操作受限");
            return false;
        }
        return true;
    }
}
