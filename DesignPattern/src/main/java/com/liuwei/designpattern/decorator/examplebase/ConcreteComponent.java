package com.liuwei.designpattern.decorator.examplebase;

public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("基础操作");
    }
}
