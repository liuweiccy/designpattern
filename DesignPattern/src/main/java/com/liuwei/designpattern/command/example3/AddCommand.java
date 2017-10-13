package com.liuwei.designpattern.command.example3;

import java.util.Stack;

public class AddCommand extends AbstractCommand {

    private Adder adder = new Adder();
    // 利用Java的栈，记录参数的变化
    private Stack<Integer> stack = new Stack<>();

    @Override
    public int execute(int value) {
        stack.push(value);
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-stack.pop());
    }
}