package com.liuwei.designpattern.state.example3;

/**
 * @author liuwei2
 */
public class LargerAbstractState extends AbstractState {
    @Override
    public void display() {
        System.out.println("2倍大小");
    }
}
