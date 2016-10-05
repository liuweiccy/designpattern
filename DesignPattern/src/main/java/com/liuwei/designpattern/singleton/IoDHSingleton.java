package com.liuwei.designpattern.singleton;

/**
 * 具备懒汉式单例和饿汉式单例的邮电
 *
 */
public class IoDHSingleton {

    private IoDHSingleton() {
        System.out.println("创建单例");
    }

    private static class HolderClass {
        private final static IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance() {
        System.out.println("获取单例");
        return HolderClass.instance;
    }
}
