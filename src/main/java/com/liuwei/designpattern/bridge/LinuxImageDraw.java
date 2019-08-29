package com.liuwei.designpattern.bridge;

/**
 * linux系统矩阵绘制
 * @author liuwei2
 * @date 2019/08/26 11:02
 */
public class LinuxImageDraw implements ImageDraw {
    @Override
    public void doPoint(Matrix m) {
        System.out.printf("linux : %s\n", m.done());
    }
}
