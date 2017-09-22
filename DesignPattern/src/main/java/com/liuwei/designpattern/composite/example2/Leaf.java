package com.liuwei.designpattern.composite.example2;

import lombok.Getter;

public class Leaf extends Component {

    @Getter
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("**********正在对叶子节点" + name + "进行杀毒");
    }
}
