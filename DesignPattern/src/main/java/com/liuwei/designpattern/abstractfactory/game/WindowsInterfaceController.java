package com.liuwei.designpattern.abstractfactory.game;

public class WindowsInterfaceController implements InterfaceController {
    @Override
    public void display() {
        System.out.println("Windows游戏界面");
    }
}
