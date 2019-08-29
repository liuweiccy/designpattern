package com.liuwei.designpattern.vistor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 临时雇员（具体的被访问者）
 * @author liuwei2
 * @date 2019/08/29 17:31
 */
@Getter
@Setter
@AllArgsConstructor
public class ParttimeEmployee implements Employee {
    private String name;
    private double hourWage;
    private int workTime;

    @Override
    public void accept(Department department) {
        department.visit(this);
    }
}
