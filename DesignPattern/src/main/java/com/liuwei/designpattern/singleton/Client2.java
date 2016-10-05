package com.liuwei.designpattern.singleton;

public class Client2 {
    public static void main(String[] args) {
        EagerSingleton e1 = EagerSingleton.getInstance();
        EagerSingleton e2 = EagerSingleton.getInstance();
        System.out.println(e1 == e2);
        LazySingleton L1 = LazySingleton.getInstance();
        LazySingleton L2 = LazySingleton.getInstance();
        System.out.println(L1 == L2);
        IoDHSingleton i1 = IoDHSingleton.getInstance();
        IoDHSingleton i2 = IoDHSingleton.getInstance();
        System.out.println(i1 == i2);
    }
}
