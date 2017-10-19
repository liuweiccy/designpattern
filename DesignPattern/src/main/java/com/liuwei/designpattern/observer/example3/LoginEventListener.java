package com.liuwei.designpattern.observer.example3;

/**
 * @author liuwei2
 */
public interface LoginEventListener {
    /**
     * 验证登陆事件
     * @param event     登陆事件
     */
    void vaildateLogin(LoginEvent event);
}
