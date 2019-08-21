package com.liuwei.designpattern.composite.example1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Composite2 extends Component {

    @Getter
    @Setter
    private String name;

    public Composite2(String name) {
        this.name = name;
    }

    private List<Component> componentList = new ArrayList<>();

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public Component getChild(int i) {
        return componentList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("-----对文件夹" + name + "杀毒");
        for (Component component : componentList) {
            component.killVirus();
        }
    }
}
