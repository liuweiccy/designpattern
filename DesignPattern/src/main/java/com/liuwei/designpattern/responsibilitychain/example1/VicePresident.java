package com.liuwei.designpattern.responsibilitychain.example1;

public class VicePresident extends Approve {
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < 100000) {
            System.out.println(getName() + "处理订单：" + purchaseRequest.toString());
        } else {
            this.successer.processRequest(purchaseRequest);
        }
    }
}
