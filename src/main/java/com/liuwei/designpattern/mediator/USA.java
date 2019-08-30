package com.liuwei.designpattern.mediator;

import javax.naming.Name;

/**
 * 美国（具体同事类）
 *
 * @author liuwei2
 * @date 2019/08/30 15:48
 */
public class USA extends Country {
    private String name;

    public USA(UnitedNations unitedNations, String name) {
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
