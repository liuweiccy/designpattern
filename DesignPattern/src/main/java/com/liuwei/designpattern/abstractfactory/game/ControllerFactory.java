package com.liuwei.designpattern.abstractfactory.game;

public interface ControllerFactory {
    OperationController createOperationController();
    InterfaceController createInterfaceController();
}
