package com.liuwei.designpattern.abstractfactory.game;

import com.liuwei.designpattern.util.XMLUtil;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ControllerFactory controllerFactory = (ControllerFactory) Class.forName(XMLUtil.getChartType("controller")).newInstance();
        InterfaceController interfaceController = controllerFactory.createInterfaceController();
        OperationController operationController= controllerFactory.createOperationController();
        interfaceController.display();
        operationController.operation();
    }
}
