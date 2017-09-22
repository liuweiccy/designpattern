package com.liuwei.designpattern.composite.badexample;

public class Client {
    public static void main(String[] args) {
        Folder folder1, folder2, folder3;
        folder1 = new Folder("Sunny的资料");
        folder2 = new Folder("图像文件夹");
        folder3 = new Folder("文本文件夹");

        ImageFile imageFile1, imageFile2, imageFile3;
        imageFile1 = new ImageFile("VV.jpg");
        imageFile2 = new ImageFile("YY.jpg");
        imageFile3 = new ImageFile("BB.jpg");

        TextFile textFile1, textFile2, textFile3;
        textFile1 = new TextFile("11.txt");
        textFile2 = new TextFile("22.txt");
        textFile3 = new TextFile("33.txt");


        folder1.addFolder(folder2);
        folder1.addFolder(folder3);
        folder1.addImageFile(imageFile1);
        folder1.addTextFile(textFile1);

        folder2.addImageFile(imageFile2);
        folder2.addImageFile(imageFile3);

        folder3.addTextFile(textFile2);
        folder3.addTextFile(textFile3);

        folder1.killVirus();
    }
}
