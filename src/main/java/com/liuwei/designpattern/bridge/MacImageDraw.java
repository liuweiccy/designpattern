package com.liuwei.designpattern.bridge;

/**
 * mac系统矩阵绘制
 * @author liuwei2
 * @date 2019/08/26 11:02
 */
public class MacImageDraw implements ImageDraw {
    @Override
    public void doPoint(Matrix m) {
        System.out.printf("mac : %s\n", m.done());
    }
}
