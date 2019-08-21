package com.liuwei.designpattern.state.example3;

/**
 * @author liuwei2
 */
public class Client {
    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.onClick();
        screen.onClick();
        screen.onClick();
        screen.onClick();
        screen.onClick();
        screen.onClick();
    }
}
