package com.liuwei.designpattern.abstractfactory.game;

public class WindowsOperationController implements OperationController {
    @Override
    public void operation() {
        System.out.println("Windows游戏控制");
    }
}
