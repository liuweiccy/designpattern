package com.liuwei.designpattern.proxy.example2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 学习使用动态代理技术，JDK原生支持的动态代理技术
 * 优点：减少代理类的数量
 * 缺点：客户端调用是复杂度增加，性能对比静态代理弱，建议使用开源框JAVAssist架编写代码
 */
public class Client {

    public static void main(String[] args) {
        InvocationHandler handler;

        AbstractUserDAO userDAO = new UserDAO();
        handler = new DAOLogHandler(userDAO);
        AbstractUserDAO proxy = (AbstractUserDAO) Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), new Class[]{AbstractUserDAO.class}, handler);
        proxy.findUserById("VV");

        System.out.println("---------------------------------");

        AbstractDocumentDAO documentDAO = new DocumentDAO();
        handler = new DAOLogHandler(documentDAO);
        AbstractDocumentDAO proxy1 = (AbstractDocumentDAO) Proxy.newProxyInstance(documentDAO.getClass().getClassLoader(), new Class[]{AbstractDocumentDAO.class}, handler);
        proxy1.deleteDocumentById("excel");
    }
}