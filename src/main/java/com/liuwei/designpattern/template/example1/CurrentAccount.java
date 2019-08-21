package com.liuwei.designpattern.template.example1;

/**
 * @author liuwei2
 */
public class CurrentAccount extends BaseAccount {
    @Override
    public void computeInterest() {
        System.out.println("计算活期利息");
    }
}
