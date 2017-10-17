package com.liuwei.designpattern.singleton;

public class LazySingleton {

    private volatile static LazySingleton instance = null;

    private LazySingleton() {
        System.out.println("创建懒汉式单例");
    }

    public static LazySingleton getInstance() {
        System.out.println("获取懒汉式单例");
        if (instance == null) { // 双重检查锁定
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
