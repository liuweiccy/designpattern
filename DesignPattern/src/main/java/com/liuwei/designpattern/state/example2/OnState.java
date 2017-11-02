package com.liuwei.designpattern.state.example2;

/**
 * @author liuwei2
 */
public class OnState extends State {
    @Override
    public void on(Switch s) {
        System.out.println("已经处于开启状态");
    }

    @Override
    public void off(Switch s) {
        System.out.println("关闭");
        s.setState(Switch.getState("off"));
    }
}
