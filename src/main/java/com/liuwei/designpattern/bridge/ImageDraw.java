package com.liuwei.designpattern.bridge;

/**
 * 图片格式接口
 * @author liuwei2
 * @date 2019/08/26 10:59
 */
public interface ImageDraw {
    /**
     * 绘制像素点阵
     * @param m 矩阵实例
     */
    void doPoint(Matrix m);
}
