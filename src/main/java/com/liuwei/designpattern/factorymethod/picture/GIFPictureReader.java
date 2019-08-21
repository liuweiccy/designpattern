package com.liuwei.designpattern.factorymethod.picture;

public class GIFPictureReader implements PictureReader {
    @Override
    public void read() {
        System.out.println("读取GIF图片");
    }
}
