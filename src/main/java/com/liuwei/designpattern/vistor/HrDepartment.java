package com.liuwei.designpattern.vistor;

/**
 * HR部门（具体访问者）
 *
 * @author liuwei2
 * @date 2019/08/29 17:52
 */
public class HrDepartment implements Department {
    @Override
    public void visit(FulltimeEmployee employee) {
        int fixedTime = 40;
        int differentTime = employee.getWorkTime() - fixedTime;
        if (differentTime >= 0) {
            System.out.printf("全职员工%s一周工作时长为%d,加班时长%d\n", employee.getName(), employee.getWorkTime(), differentTime);
        } else {
            System.out.printf("全职员工%s一周工作时长为%d,缺少时长%d\n", employee.getName(), employee.getWorkTime(), -differentTime);
        }
    }

    @Override
    public void visit(ParttimeEmployee employee) {
        System.out.printf("临时员工%s一周实际工作时长：%d\n", employee.getName(), employee.getWorkTime());
    }
}
