package com.liuwei.designpattern.bridge;

/**
 * BMP格式
 * @author liuwei2
 * @date 2019/08/27 16:44
 */
public class BmpImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imageDraw.doPoint(matrix);
        System.out.printf("%s:是BMP格式！\n", fileName);
    }
}
