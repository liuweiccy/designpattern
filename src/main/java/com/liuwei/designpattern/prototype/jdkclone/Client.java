package com.liuwei.designpattern.prototype.jdkclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        WeeklyLog log = new WeeklyLog();
        log.setName("liu");
        log.setDate("10-5");
        log.setContent("学习设计模式");
        WeeklyLog log1 = (WeeklyLog) log.clone();
//        log1.setDate("10-6");
        System.out.println(log.toString());
        System.out.println(log1.toString());
        System.out.println(log == log1);
        System.out.println(log.getClass() == log1.getClass());
        System.out.println(log.getName() == log1.getName());
        System.out.println(log.getContent() == log1.getContent());
        System.out.println(log.getDate() == log1.getDate());
        System.out.println(log1.getDate());
        System.out.println(log.getDate());

    }
}
