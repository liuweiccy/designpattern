package com.liuwei.designpattern.decorator.example1;

public class ScrollBaeDecorator extends ComponentDecorator {

    public ScrollBaeDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("添加上滚动条");
    }
}
