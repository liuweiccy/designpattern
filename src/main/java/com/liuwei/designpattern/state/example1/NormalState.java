package com.liuwei.designpattern.state.example1;

/**
 * 正常状态
 * @author liuwei2
 */
public class NormalState extends AccountState {

    public NormalState(Account account) {
        this.account = account;
    }

    public NormalState(AccountState state) {
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
        System.out.println("正常状态，无须支付利息。");
    }

    @Override
    public boolean stateCheck() {
        if (account.getBalance() > -2000 && account.getBalance() < 0) {
            account.setState(new OverdraftState(this));
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
