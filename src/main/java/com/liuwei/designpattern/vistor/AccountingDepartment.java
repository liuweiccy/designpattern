package com.liuwei.designpattern.vistor;

/**
 * 会计部（具体访问者，对数据做具体的操作）
 *
 * @author liuwei2
 * @date 2019/08/29 17:37
 */
public class AccountingDepartment implements Department {
    @Override
    public void visit(FulltimeEmployee employee) {
        int fixedTime = 40;
        double totalPay;
        if (employee.getWorkTime() >= fixedTime) {
            totalPay = employee.getWeeklyWage() + (employee.getWorkTime() - fixedTime) * 100;
        } else {
            totalPay = employee.getWeeklyWage() + (employee.getWorkTime() - fixedTime) * 80;
            if (totalPay < 0) {
                totalPay = 0;
            }
        }
        System.out.printf("全职员工%s一周的总收入为：%9.2f\n", employee.getName(), totalPay);
    }

    @Override
    public void visit(ParttimeEmployee employee) {
        double totalPay = employee.getHourWage() * employee.getWorkTime();
        System.out.printf("临时员工%s一周的总收入为：%9.2f\n", employee.getName(), totalPay);
    }
}
