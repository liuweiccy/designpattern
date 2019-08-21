package com.liuwei.designpattern.command.example2;

import java.util.ArrayList;

public class FBSettingWindow {
    private String name;
    private ArrayList<FunctionButton> buttons = new ArrayList<>(4);

    public FBSettingWindow(String name) {
        this.name = name;
    }

    public void addButton(FunctionButton button) {
        buttons.add(button);
    }

    public void removeButton(FunctionButton button) {
        buttons.remove(button);
    }

    public void display() {
        System.out.println("显示窗口：" + this.name);
        System.out.println("显示功能键：");
        for (FunctionButton button : buttons) {
            System.out.println(button.getName());
        }
        System.out.println("-----------------------------------------");
    }
}
