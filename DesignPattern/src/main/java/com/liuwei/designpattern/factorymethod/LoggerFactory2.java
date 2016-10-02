package com.liuwei.designpattern.factorymethod;

public abstract class LoggerFactory2 {

    public void writeLog() {
        Logger logger = this.createLogger();
        logger.writeLog();
    }

    abstract Logger createLogger();
}
