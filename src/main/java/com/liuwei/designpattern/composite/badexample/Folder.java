package com.liuwei.designpattern.composite.badexample;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    @NonNull
    private String name;

    private List<Folder> folderList = new ArrayList<Folder>();
    private List<ImageFile> imageFileList = new ArrayList<ImageFile>();
    private List<TextFile> textFileList = new ArrayList<TextFile>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFolder(Folder folder) {
        folderList.add(folder);
    }

    public void addImageFile(ImageFile imageFile) {
        imageFileList.add(imageFile);
    }

    public void addTextFile(TextFile textFile) {
        textFileList.add(textFile);
    }

    public void killVirus() {
        System.out.println("对文件夹：" + name + " 进行杀毒");

        for (Folder folder : folderList) {
            folder.killVirus();
        }

        for (ImageFile imageFile : imageFileList) {
            imageFile.killVirus();
        }

        for (TextFile textFile : textFileList) {
            textFile.killVirus();
        }
    }
}
