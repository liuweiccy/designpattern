package com.liuwei.designpattern.state.example2;

/**
 * @author liuwei2
 */
public class OffState extends State {
    @Override
    public void on(Switch s) {
        System.out.println("打开");
        s.setState(Switch.getState("on"));
    }

    @Override
    public void off(Switch s) {
        System.out.println("已经关闭");
    }
}
