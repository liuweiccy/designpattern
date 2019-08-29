package com.liuwei.designpattern.vistor;

/**
 * 雇员(抽象的被访问者)
 *
 * @author liuwei2
 * @date 2019/08/29 17:18
 */
public interface Employee {
    /**
     * 抽象的雇员接受被访问者的访问
     * @param department    抽象的访问部门
     */
    void accept(Department department);
}
