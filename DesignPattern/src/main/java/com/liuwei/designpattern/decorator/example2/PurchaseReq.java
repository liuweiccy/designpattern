package com.liuwei.designpattern.decorator.example2;

import lombok.Getter;

public class PurchaseReq extends Document {
    @Getter
    private String name;

    public PurchaseReq(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("购货单：" + name);
    }
}
