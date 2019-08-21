package com.liuwei.designpattern.command.example2;

public class MinimizeCommand extends Command {
    private MinimizeHandler handler;

    public MinimizeCommand(MinimizeHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute() {
        handler.minimize();
    }
}
