package com.liuwei.designpattern.builder.player;

public class SimplePlayerBuilder extends PlayerBuilder {
    @Override
    public void buildMenu() {
        System.out.print("精简菜单");
    }

    @Override
    public void buildList() {
        System.out.print("精简列表");
    }

    @Override
    public void buildWindows() {
        System.out.print("精简窗口");
    }

    @Override
    public void buildControlBar() {
        System.out.print("精简控制条");
    }
}
