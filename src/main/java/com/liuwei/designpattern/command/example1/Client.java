package com.liuwei.designpattern.command.example1;

public class Client {

    public static void main(String[] args) {
        FBSettingWindow window = new FBSettingWindow("功能设置窗口");

        FunctionButton button1, button2;
        button1 = new FunctionButton("最小化窗口");
        button2 = new FunctionButton("显示帮助文档");

        Command command1, command2;
        command1 = new MinimizeCommand(new MinimizeHandler());
        command2 = new HelpCommand(new HelpHandler());

        button1.setCommand(command1);
        button2.setCommand(command2);

        window.addButton(button1);
        window.addButton(button2);

        window.display();

        button1.onClick();
        button2.onClick();
    }
}
