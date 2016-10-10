package com.liuwei.designpattern.builder.player;

public class DefaultPlayerBuilder extends PlayerBuilder {
    @Override
    public void buildMenu() {
        System.out.print("完整菜单");
    }

    @Override
    public void buildList() {
        System.out.print("完整列表");
    }

    @Override
    public void buildWindows() {
        System.out.print("完整窗口");
    }

    @Override
    public void buildControlBar() {
        System.out.print("完整控制条");
    }
}
