package com.liuwei.designpattern.observer.example3;

/**
 * @author liuwei2
 */
public class ConcreteEventListener implements LoginEventListener {
    @Override
    public void vaildateLogin(LoginEvent event) {
        if (null == event.getName() || null == event.getPassword()) {
            throw new NullPointerException();
        } else {
            System.out.println(event);
        }
    }
}
