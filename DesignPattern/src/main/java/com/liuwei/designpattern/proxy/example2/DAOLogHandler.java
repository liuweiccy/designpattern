package com.liuwei.designpattern.proxy.example2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.LocalDate;

public class DAOLogHandler implements InvocationHandler {

    private Object proxyInstance;

    public DAOLogHandler(Object proxyInstance) {
        this.proxyInstance = proxyInstance;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        LocalDate localDate = LocalDate.now();
        System.out.println("调用时间为：" +  localDate);
        Object result =  method.invoke(proxyInstance, args);
        System.out.println("调用结束");
        return result;
    }
}
