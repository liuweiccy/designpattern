package com.liuwei.designpattern.mediator;

/**
 * 国家（抽象同事类）
 *
 * @author liuwei2
 * @date 2019/08/30 15:43
 */
public abstract class Country {
    protected UnitedNations unitedNations;

    public Country(UnitedNations unitedNations) {
        this.unitedNations = unitedNations;
    }

    public abstract void declare(String message);
}
