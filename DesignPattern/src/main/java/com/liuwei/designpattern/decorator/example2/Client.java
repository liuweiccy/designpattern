package com.liuwei.designpattern.decorator.example2;

public class Client {

    public static void main(String[] args) {
        Document document = new PurchaseReq("采购请求");
        Document document1 = new Approver(document);
        Document document2 = new Deleter(document1);

        document2.display();
    }
}
