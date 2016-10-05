package com.liuwei.designpattern.abstractfactory.game;

public class AndroidInterfaceController implements InterfaceController {
    @Override
    public void display() {
        System.out.println("Android游戏界面");
    }
}
