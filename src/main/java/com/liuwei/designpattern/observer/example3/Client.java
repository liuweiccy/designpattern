package com.liuwei.designpattern.observer.example3;

/**
 * @author liuwei2
 */
public class Client {

    public static void main(String[] args) {
        LoginEventListener listener = new ConcreteEventListener();

        LoginBean bean = new LoginBean();
        bean.setLoginEventListener(listener);

        bean.fireLoginEvent("VV", "123456");
    }
}
