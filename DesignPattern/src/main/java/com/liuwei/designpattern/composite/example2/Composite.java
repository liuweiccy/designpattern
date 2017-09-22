package com.liuwei.designpattern.composite.example2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    @Getter
    @Setter
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    private List<Component> componentList = new ArrayList<>();

    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void killVirus() {
        System.out.println("-----对文件夹" + name + "杀毒");
        for (Component component : componentList) {
            component.killVirus();
        }
    }
}
