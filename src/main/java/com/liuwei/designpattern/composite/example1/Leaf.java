package com.liuwei.designpattern.composite.example1;

import lombok.Getter;

public class Leaf extends Component {

    @Getter
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        throw new RuntimeException("叶子节点不能够再添加子节点");
    }

    @Override
    public Component getChild(int i) {
        throw new RuntimeException("叶子节点没有子节点");
    }

    @Override
    public void killVirus() {
        System.out.println("**********正在对叶子节点" + name + "进行杀毒");
    }
}
