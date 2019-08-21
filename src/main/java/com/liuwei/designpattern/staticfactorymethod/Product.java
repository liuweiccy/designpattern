package com.liuwei.designpattern.staticfactorymethod;

public abstract class Product {

    public void methodSame() {
        System.out.println("Product::methodSame()");
    }

    public abstract void methodDiff();
}
