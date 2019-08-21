package com.liuwei.designpattern.responsibilitychain.example1;

import lombok.Getter;
import lombok.Setter;

public abstract class Approve {
    @Getter
    private String name;
    @Setter
    protected Approve successer;

    public Approve(String name) {
        this.name = name;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
