package com.liuwei.designpattern.abstractfactory.game;

public class WindowsControllerFactory implements ControllerFactory {
    @Override
    public OperationController createOperationController() {
        return new WindowsOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new WindowsInterfaceController();
    }
}
