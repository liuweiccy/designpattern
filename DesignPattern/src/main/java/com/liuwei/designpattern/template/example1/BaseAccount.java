package com.liuwei.designpattern.template.example1;

/**
 * @author liuwei2
 */
public abstract class BaseAccount {
    public boolean validate(String name, String password) {
        System.out.println("账户名：" + name);
        System.out.println("密码：" + password);
        return true;
    }

    /**
     * 计算利息抽象方法，由子类实现
     */
    public abstract void computeInterest();

    public void display() {
        System.out.println("显示利息");
    }

    /**
     * 模板方法，组合步骤
     * @param name          名字
     * @param password      密码
     */
    public void handle(String name, String password) {
        if (!validate(name, password)) {
            System.out.println("账号信息错误");
            return;
        }
        computeInterest();
        display();
    }
}
