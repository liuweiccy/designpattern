package com.liuwei.designpattern.abstractfactory.game;

public class AndroidControllerFactory implements ControllerFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }
}
