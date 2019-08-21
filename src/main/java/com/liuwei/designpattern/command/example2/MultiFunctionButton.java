package com.liuwei.designpattern.command.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiFunctionButton {
    private String name;
    private List<Command> commandQueue = new ArrayList<>();

    public MultiFunctionButton(String name) {
        this.name = name;
    }

    public void addCommand(Command... command) {
        commandQueue.addAll(Arrays.asList(command));
    }

    public void onClick() {
        System.out.println("一键点击");
        for (Command command : commandQueue) {
            command.execute();
        }
    }
}
