package com.liuwei.designpattern.vistor;

import java.util.ArrayList;
import java.util.List;

/**
 * 雇员列表（核心数据结构）
 *
 * @author liuwei2
 * @date 2019/08/29 18:11
 */
public class EmployeeList {
    private List<Employee> employees = new ArrayList<>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void handle(Department department) {
        for (Employee employee : employees) {
            employee.accept(department);
        }
    }
}
