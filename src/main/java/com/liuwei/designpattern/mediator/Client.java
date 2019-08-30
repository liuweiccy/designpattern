package com.liuwei.designpattern.mediator;

/**
 * 测试中介者模式
 *
 * @author liuwei2
 * @date 2019/08/30 16:11
 */
public class Client {
    public static void main(String[] args) {
        UnSecurityCouncil unitedNations = new UnSecurityCouncil();

        USA usa = new USA(unitedNations, "美利坚合众国");
        China china = new China(unitedNations, "中华人民共和国");

        unitedNations.setChina(china);
        unitedNations.setUsa(usa);

        usa.declare("我要增加你的关税！！");
        china.declare("我会对等增加，奉陪到底！！");
    }
}
