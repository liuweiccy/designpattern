package com.liuwei.designpattern.command.example1;

import lombok.Getter;
import lombok.Setter;

public class FunctionButton {
    @Getter
    private String name;
    @Setter
    private Command command;

    public FunctionButton(String name) {
        this.name = name;
    }

    public void onClick() {
        System.out.print("点击功能键：");
        command.execute();
    }
}
