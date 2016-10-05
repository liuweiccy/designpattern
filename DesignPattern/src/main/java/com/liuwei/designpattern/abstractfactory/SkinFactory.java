package com.liuwei.designpattern.abstractfactory;

public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}
