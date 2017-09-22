package com.liuwei.designpattern.composite.example2;

import lombok.Getter;

public class Image extends Component {

    @Getter
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("**********正在对图片节点" + name + "进行杀毒");
    }
}
