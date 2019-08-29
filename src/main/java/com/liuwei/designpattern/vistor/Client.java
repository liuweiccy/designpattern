package com.liuwei.designpattern.vistor;

/**
 * 测试类
 *
 * @author liuwei2
 * @date 2019/08/29 18:18
 */
public class Client {
    public static void main(String[] args) {
        Employee a = new FulltimeEmployee("大华", 2200, 40);
        Employee b = new FulltimeEmployee("小米", 3000, 52);
        Employee c = new FulltimeEmployee("张栓到", 2600, 35);
        Employee d = new FulltimeEmployee("李代符", 3200, 32);
        Employee e = new FulltimeEmployee("王富贵", 2900, 45);

        Employee m = new ParttimeEmployee("于欧锦", 29, 45);
        Employee n = new ParttimeEmployee("孙宏伟", 20, 37);

        EmployeeList employeeList = new EmployeeList();
        employeeList.add(a);
        employeeList.add(b);
        employeeList.add(c);
        employeeList.add(d);
        employeeList.add(e);

        employeeList.add(m);
        employeeList.add(n);

        System.out.println("===================HR===================");
        Department hr = new HrDepartment();
        employeeList.handle(hr);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("===================Accounting===========");
        Department accounting = new AccountingDepartment();
        employeeList.handle(accounting);
    }
}
