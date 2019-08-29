package com.liuwei.designpattern.bridge;

/**
 * 生成最终的图片
 * @author liuwei2
 * @date 2019/08/26 11:12
 */
public abstract class Image {
    protected ImageDraw imageDraw;

    public void setImageDraw(ImageDraw imageDraw) {
        this.imageDraw = imageDraw;
    }

    /**
     * 由具体的实现类实现生成具体的图片的格式
     */
    public abstract void parseFile(String fileName);
}
