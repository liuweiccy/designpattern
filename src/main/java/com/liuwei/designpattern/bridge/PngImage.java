package com.liuwei.designpattern.bridge;

/**
 * PNG格式
 *
 * @author liuwei2
 * @date 2019/08/27 16:37
 */
public class PngImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imageDraw.doPoint(matrix);
        System.out.printf("%s：是PNG格式！\n", fileName);
    }
}
