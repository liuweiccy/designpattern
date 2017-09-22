package com.liuwei.designpattern.composite.example3;

/**
 * 实现透明组合模式
 */
public abstract class AbstractCompany {
    public abstract void notice();
    public abstract void add(AbstractCompany abstractCompany);
}
