package com.liuwei.designpattern.responsibilitychain.example1;

public class Client2 {
    public static void main(String[] args) {
        Approve wjzhang, gyang, jguo, meeting;

        wjzhang = new Director("张无忌");
        jguo = new President("郭靖");
        meeting = new Congress("董事会");

        wjzhang.setSuccesser(jguo);
        jguo.setSuccesser(meeting);

        PurchaseRequest pr1, pr2, pr3, pr4;

        pr1 = new PurchaseRequest(45000, 1001, "购买倚天剑");
        wjzhang.processRequest(pr1);

        pr2 = new PurchaseRequest(80000, 1002, "购买屠龙刀");
        wjzhang.processRequest(pr2);

        pr3 = new PurchaseRequest(145000, 1003, "购买《九阴真经》");
        wjzhang.processRequest(pr3);

        pr4 = new PurchaseRequest(1045000, 1004, "购买桃花岛");
        wjzhang.processRequest(pr4);
    }
}
