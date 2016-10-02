package com.liuwei.designpattern.factorymethod;

public class FileLoggerFactory2 extends LoggerFactory2 {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
