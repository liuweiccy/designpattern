package com.liuwei.designpattern.bridge;

/**
 * windows系统矩阵绘制
 * @author liuwei2
 * @date 2019/08/26 11:02
 */
public class WindowsImageDraw implements ImageDraw {
    @Override
    public void doPoint(Matrix m) {
        System.out.printf("windows : %s\n", m.done());
    }
}
