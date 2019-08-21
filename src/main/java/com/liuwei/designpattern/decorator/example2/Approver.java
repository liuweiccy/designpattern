package com.liuwei.designpattern.decorator.example2;

public class Approver extends Decorator {

    private Document document;

    public Approver(Document document) {
        super(document);
    }

    public void doApprover() {
        System.out.println("进行审批");
    }

    @Override
    public void display() {
        super.display();
        doApprover();
    }
}