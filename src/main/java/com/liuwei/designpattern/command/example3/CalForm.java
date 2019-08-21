package com.liuwei.designpattern.command.example3;

public class CalForm {
    private AbstractCommand command;

    public CalForm(AbstractCommand command) {
        this.command = command;
    }

    public void compute(int value) {
        int res = command.execute(value);
        System.out.println("计算结果为：" + res);
    }

    public void undo() {
        int res = command.undo();
        System.out.println("撤销后的结果为：" +  res);
    }
}
