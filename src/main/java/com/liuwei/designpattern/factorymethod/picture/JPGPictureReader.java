package com.liuwei.designpattern.factorymethod.picture;

public class JPGPictureReader implements PictureReader{
    @Override
    public void read() {
        System.out.println("读取JPG图片");
    }
}
