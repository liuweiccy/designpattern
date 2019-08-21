package com.liuwei.designpattern.responsibilitychain.example2;

public class President extends Approve {
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(Leave leave) {
        if (leave.getNumber() < 30) {
            System.out.println(getName() + "审批假条：" + leave.toString());
        } else {
            this.successer.processRequest(leave);
        }
    }
}
