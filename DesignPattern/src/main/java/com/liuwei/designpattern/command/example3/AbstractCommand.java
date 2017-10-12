package com.liuwei.designpattern.command.example3;

public abstract class AbstractCommand {
    public abstract int execute(int value);
    public abstract int undo();
}
