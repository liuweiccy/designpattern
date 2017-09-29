package com.liuwei.designpattern.responsibilitychain.example1;

public class Congress extends Approve {
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        System.out.println(getName() + "审批订单：" + purchaseRequest.toString());
    }
}
