package com.liuwei.designpattern.template.example1;

/**
 * @author liuwei2
 */
public class SavingAccount extends BaseAccount {
    @Override
    public void computeInterest() {
        System.out.println("计算定期利息");
    }
}
