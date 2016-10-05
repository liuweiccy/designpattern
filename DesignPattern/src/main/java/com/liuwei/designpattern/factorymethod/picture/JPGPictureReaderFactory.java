package com.liuwei.designpattern.factorymethod.picture;

public class JPGPictureReaderFactory implements PictureReaderFactory {
    @Override
    public PictureReader createPicture() {
        return new JPGPictureReader();
    }
}
