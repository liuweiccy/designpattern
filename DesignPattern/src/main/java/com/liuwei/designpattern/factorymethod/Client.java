package com.liuwei.designpattern.factorymethod;

import com.liuwei.designpattern.util.XMLUtil;

public class Client {
    public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        LoggerFactory factory = new FileLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();
        factory = (LoggerFactory) Class.forName(XMLUtil.getChartType("className")).newInstance();
        logger = factory.createLogger();
        logger.writeLog();
        // 此方法的确可行，缺点：？？？
        logger = (Logger) Class.forName("com.liuwei.designpattern.factorymethod.FileLogger").newInstance();
        logger.writeLog();

        LoggerFactory2 factory2 = (LoggerFactory2) Class.forName(XMLUtil.getChartType("className2")).newInstance();
        factory2.writeLog();
    }
}
