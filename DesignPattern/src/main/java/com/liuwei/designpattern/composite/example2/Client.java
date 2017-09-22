package com.liuwei.designpattern.composite.example2;

public class Client {

    public static void main(String[] args) {
        Composite component1, component2, component7;
        component1 = new Composite("Sunny的资料");
        component2 = new Composite("文本");
        component7 = new Composite("图片");

        Component component3, component4;
        component3 = new Leaf("VV.txt");
        component4 = new Leaf("YY.txt");

        Component component5, component6;
        component5 = new Image("MM.jpg");
        component6 = new Image("SS.jpg");

        component1.add(component5);
        component1.add(component2);
        component1.add(component7);

        component2.add(component3);
        component2.add(component4);

        component7.add(component6);

        component1.killVirus();
    }
}
