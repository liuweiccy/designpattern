package com.liuwei.designpattern.observer.jvm;

/**
 * ....
 *
 * @author Eric Liu
 * @date 2019/08/21 23:29
 */
public class Client {
    public static void main(String[] args) {
        Pub pub = new Pub();

        Sub sub1 = new Sub("pub1", pub);
        Sub sub2 = new Sub("pub2", pub);
        Sub sub3 = new Sub("pub3", pub);

        String s = "Hello";
        System.out.printf("发送字符串：%s\n", s);
        pub.setMsg(s);
    }
}
