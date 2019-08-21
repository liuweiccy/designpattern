package com.liuwei.designpattern.composite.example3;

public class Client {
    public static void main(String[] args) {
        AbstractCompany company1, company2, company3;
        company1 = new Company("Sunny北京总公司");
        company2 = new Company("上海分公司");
        company3 = new Company("深圳分公司");

        AbstractCompany rd1, rd2, rd3;
        rd1 = new RAndD("总公司研发部");
        rd2 = new RAndD("上海研发部");
        rd3 = new RAndD("深圳研发部");

        AbstractCompany account1, account2, account3;
        account1 = new Accounting("总公司财务部");
        account2 = new Accounting("上海财务部");
        account3 = new Accounting("深圳财务部");

        company1.add(company2);
        company1.add(company3);
        company1.add(rd1);
        company1.add(account1);

        company2.add(rd2);
        company2.add(account2);

        company3.add(rd3);
        company3.add(account3);

        company1.notice();
        System.out.println("----------------------");
        company3.notice();
    }
}
