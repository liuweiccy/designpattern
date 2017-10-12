package com.liuwei.designpattern.command.example2;

public class HelpCommand extends Command {
    private HelpHandler handler;

    public HelpCommand(HelpHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute() {
        handler.display();
    }
}
