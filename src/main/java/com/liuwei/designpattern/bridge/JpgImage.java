package com.liuwei.designpattern.bridge;

/**
 * JPG格式
 * @author liuwei2
 * @date 2019/08/26 11:48
 */
public class JpgImage extends Image {

    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imageDraw.doPoint(matrix);
        System.out.printf("%s：是JPG格式！\n", fileName);
    }
}
