package com.liuwei.designpattern.builder.player;

public class NetPlayerBuilder extends PlayerBuilder {
    @Override
    public void buildMenu() {
        System.out.print("网络菜单");
    }

    @Override
    public void buildList() {
        System.out.print("网络列表");
    }

    @Override
    public void buildWindows() {
        System.out.print("网络窗口");
    }

    @Override
    public void buildControlBar() {
        System.out.print("网络控制条");
    }
}
