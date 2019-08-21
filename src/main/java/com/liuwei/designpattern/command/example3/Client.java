package com.liuwei.designpattern.command.example3;

public class Client {

    public static void main(String[] args) {
        AbstractCommand command = new AddCommand();

        CalForm form = new CalForm(command);

        form.compute(1);
        form.compute(2);
        form.compute(3);
        form.compute(4);
        form.undo();
        form.undo();
    }
}
