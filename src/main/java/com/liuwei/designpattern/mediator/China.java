package com.liuwei.designpattern.mediator;

/**
 * 中国（具体的同事类）
 *
 * @author liuwei2
 * @date 2019/08/30 15:55
 */
public class China extends Country {
    private String name;

    public China(UnitedNations unitedNations, String name) {
        super(unitedNations);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void declare(String message) {
        unitedNations.declare(message, this);
    }
}
