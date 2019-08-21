package com.liuwei.designpattern.observer.example1;

/**
 * @author liuwei2
 */
public interface Observer {
    /**
     * 获取观察者名称
     * @return      返回名称
     */
    String getName();

    /**
     * 设置观察者名称
     * @param name  名称
     */
    void setName(String name);

    /**
     * 观察者帮助
     */
    void help();

    /**
     * 观察者被攻击
     * @param acc   被攻击时通知联盟控制中心
     */
    void beAttacked(AllyControlCenter acc);
}
