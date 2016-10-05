package com.liuwei.designpattern.abstractfactory.game;

public class SymbainControllerFactory implements ControllerFactory {
    @Override
    public OperationController createOperationController() {
        return new SymbainOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new SymbainInterfaceController();
    }
}
