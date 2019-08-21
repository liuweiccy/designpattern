package com.liuwei.designpattern.responsibilitychain.example2;

public class Congress extends Approve {
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(Leave leave) {
        System.out.println(getName() + "，假条：" + leave.toString());
    }
}
