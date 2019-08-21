package com.liuwei.designpattern.abstractfactory;

import com.liuwei.designpattern.util.XMLUtil;

public class Client {
    public static void main(String [] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        SkinFactory skinFactory = (SkinFactory) Class.forName(XMLUtil.getChartType("product")).newInstance();
        Button button = skinFactory.createButton();
        TextField textField = skinFactory.createTextField();
        ComboBox comboBox = skinFactory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();
    }
}
