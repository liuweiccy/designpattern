package com.liuwei.designpattern.factorymethod.picture;

public class GIFPictureReaderFactory implements PictureReaderFactory {
    @Override
    public PictureReader createPicture() {
        return new GIFPictureReader();
    }
}
