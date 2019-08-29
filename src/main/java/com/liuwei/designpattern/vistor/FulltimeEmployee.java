package com.liuwei.designpattern.vistor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 全职雇员（具体的被访问者）
 * @author liuwei2
 * @date 2019/08/29 17:23
 */
@Getter
@Setter
@AllArgsConstructor
public class FulltimeEmployee implements Employee {
    private String name;
    private double weeklyWage;
    private int workTime;

    @Override
    public void accept(Department department) {
        department.visit(this);
    }
}
