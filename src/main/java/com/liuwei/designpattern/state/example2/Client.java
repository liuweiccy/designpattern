package com.liuwei.designpattern.state.example2;

/**
 * @author liuwei2
 */
public class Client {
    public static void main(String[] args) {
        Switch s1, s2;
        s1 = new Switch("开关1");
        s2 = new Switch("开关2");

        s1.on();
        s1.off();
        s1.on();


        s2.on();
        s2.off();
        s2.on();
    }
}
