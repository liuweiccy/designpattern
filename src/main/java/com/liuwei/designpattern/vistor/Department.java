package com.liuwei.designpattern.vistor;

/**
 * 部门（抽象的访问者）
 *
 * @author liuwei2
 * @date 2019/08/29 17:18
 */
public interface Department {
    /**
     * 访问全职雇员
     * @param employee  雇员
     */
    void visit(FulltimeEmployee employee);

    /**
     * 访问临时雇员
     * @param employee  雇员
     */
    void visit(ParttimeEmployee employee);
}
