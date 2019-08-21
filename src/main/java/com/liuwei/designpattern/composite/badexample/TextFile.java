package com.liuwei.designpattern.composite.badexample;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class TextFile {
    @NonNull
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.println("*************文本文件正在杀毒，文件名称：" + name);
    }
}
