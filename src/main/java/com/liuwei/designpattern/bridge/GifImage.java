package com.liuwei.designpattern.bridge;

/**
 * GIF格式
 * @author liuwei2
 * @date 2019/08/27 16:41
 */
public class GifImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imageDraw.doPoint(matrix);
        System.out.printf("%s:是GIF格式！\n", fileName);
    }
}
