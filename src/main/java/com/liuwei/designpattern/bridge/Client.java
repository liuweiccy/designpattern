package com.liuwei.designpattern.bridge;

/**
 * 类描述。。。。
 *
 * @author liuwei2
 * @date 2019/08/27 16:46
 */
public class Client {
    public static void main(String[] args) {
        Image image;
        ImageDraw imageDraw;

        image = new JpgImage();
        imageDraw = new WindowsImageDraw();
        image.setImageDraw(imageDraw);
        image.parseFile("小龙女");

        image = new PngImage();
        imageDraw = new WindowsImageDraw();
        image.setImageDraw(imageDraw);
        image.parseFile("小龙女");

        image = new BmpImage();
        imageDraw = new MacImageDraw();
        image.setImageDraw(imageDraw);
        image.parseFile("小龙女");

        image = new GifImage();
        imageDraw = new LinuxImageDraw();
        image.setImageDraw(imageDraw);
        image.parseFile("小龙女");
    }
}
