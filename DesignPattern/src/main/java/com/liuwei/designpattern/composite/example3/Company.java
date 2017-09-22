package com.liuwei.designpattern.composite.example3;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Company extends AbstractCompany {

    @Getter
    private String name;

    public Company(String name) {
        this.name = name;
    }

    private List<AbstractCompany> companyList = new ArrayList<>();

    @Override
    public void notice() {
        System.out.println(name + "发送通知");
        for (AbstractCompany abstractCompany : companyList) {
            abstractCompany.notice();
        }
    }

    @Override
    public void add(AbstractCompany abstractCompany) {
        companyList.add(abstractCompany);
    }
}
