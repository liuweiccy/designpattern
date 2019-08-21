package com.liuwei.designpattern.factorymethod.picture;

import com.liuwei.designpattern.util.XMLUtil;

public class PictureReaderClient {
    public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        PictureReaderFactory pictureReaderFactory = (PictureReaderFactory) Class.forName(XMLUtil.getChartType("pictureReader")).newInstance();
        PictureReader pictureReader = pictureReaderFactory.createPicture();
        pictureReader.read();
    }
}
