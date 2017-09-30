package com.liuwei.designpattern.responsibilitychain.example2;

public class Client {
    public static void main(String[] args) {
        Approve wjzhang, gyang, jguo, meeting;

        wjzhang = new Director("组长");
        gyang = new VicePresident("经理");
        jguo = new President("总经理");
        meeting = new Congress("禁止");

        // 自己组装责任链
        wjzhang.setSuccesser(gyang);
        gyang.setSuccesser(jguo);
        jguo.setSuccesser(meeting);

        Leave pr1, pr2, pr3, pr4;

        pr1 = new Leave(1);
        wjzhang.processRequest(pr1);

        pr2 = new Leave(5);
        wjzhang.processRequest(pr2);

        pr3 = new Leave(15);
        wjzhang.processRequest(pr3);

        pr4 = new Leave(100);
        wjzhang.processRequest(pr4);
    }
}
