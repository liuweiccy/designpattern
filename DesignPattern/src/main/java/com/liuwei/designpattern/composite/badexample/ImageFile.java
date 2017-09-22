package com.liuwei.designpattern.composite.badexample;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class ImageFile {
    @NonNull
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.println("*************图像文件正在杀毒，文件名称：" + name);
    }
}
