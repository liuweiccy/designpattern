package com.liuwei.designpattern.state.example1;

/**
 * 受限状态
 * @author liuwei2
 */
public class RestrictedState extends AccountState {

    public RestrictedState(Account account) {
        this.account = account;
    }

    public RestrictedState(AccountState state) {
        this.account = state.account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("账号受限，取款失败");
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
        } else if (account.getBalance() > -2000) {
            account.setState(new OverdraftState(this));
            return true;
        }
        return false;
    }
}
