package com.liuwei.designpattern.abstractfactory.game;

public class AndroidOperationController implements OperationController {
    @Override
    public void operation() {
        System.out.println("Android游戏控制");
    }
}
