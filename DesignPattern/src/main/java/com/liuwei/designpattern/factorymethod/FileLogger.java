package com.liuwei.designpattern.factorymethod;

public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("日志写入文件");
    }
}
