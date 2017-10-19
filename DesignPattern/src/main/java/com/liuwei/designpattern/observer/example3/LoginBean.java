package com.liuwei.designpattern.observer.example3;

import lombok.Setter;

/**
 * @author liuwei2
 */
public class LoginBean {
    private LoginEvent loginEvent;
    @Setter
    private LoginEventListener loginEventListener;

    public void fireLoginEvent(String name, String password) {
        loginEvent = new LoginEvent();
        loginEvent.setName(name);
        loginEvent.setPassword(password);
        loginEventListener.vaildateLogin(loginEvent);
    }
}
