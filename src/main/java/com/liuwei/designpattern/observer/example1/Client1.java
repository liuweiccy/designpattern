package com.liuwei.designpattern.observer.example1;

/**
 * @author liuwei2
 */
public class Client1 {
    public static void main(String[] args) {
        AllyControlCenter ally = new ConcreteAllyControlCenter("青城派");

        Observer ob1, ob2, ob3, ob4, ob5;

        ob1 = new Player("令狐冲");
        ob2 = new Player("东方不败");
        ob3 = new Player("任我行");
        ob4 = new Player("任盈盈");
        ob5 = new Player("独孤求败");

        ally.join(ob1);
        ally.join(ob2);
        ally.join(ob3);
        ally.join(ob4);
        ally.join(ob5);

        ob4.beAttacked(ally);

        ally.quit(ob5);
    }
}
