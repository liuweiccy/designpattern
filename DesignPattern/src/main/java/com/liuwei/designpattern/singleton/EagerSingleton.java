package com.liuwei.designpattern.singleton;

public class EagerSingleton {
    private final static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("饿汉式单例构建");
    }

    public static EagerSingleton getInstance() {
        System.out.println("获取饿汉式单例");
        return instance;
    }
}
