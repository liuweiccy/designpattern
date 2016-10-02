package com.liuwei.designpattern.factorymethod;

public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("日志写入数据库");
    }
}
