package com.liuwei.designpattern.responsibilitychain.example1;

public class Director extends Approve {
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < 50000) {
            System.out.println(getName() + "审批订单：" + purchaseRequest.toString());
        } else {
            this.successer.processRequest(purchaseRequest);
        }
    }
}
