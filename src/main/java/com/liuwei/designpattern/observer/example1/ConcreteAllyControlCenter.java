package com.liuwei.designpattern.observer.example1;

/**
 * @author liuwei2
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String allyName) {
        super(allyName);
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(getAllyName() + "战队紧急通知，" + name + "被敌人攻击！");
        for (Observer player : players) {
            if (!name.equalsIgnoreCase(player.getName())) {
                player.help();
            }
        }
    }
}
