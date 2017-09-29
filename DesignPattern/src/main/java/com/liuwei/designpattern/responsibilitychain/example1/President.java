package com.liuwei.designpattern.responsibilitychain.example1;

public class President extends Approve {
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < 500000) {
            System.out.println(getName() + "处理订单：" + purchaseRequest.toString());
        } else {
            this.successer.processRequest(purchaseRequest);
        }
    }
}
