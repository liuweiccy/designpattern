package com.liuwei.designpattern.builder.player;

public class Player {
    private String menu;
    private String list;
    private String windows;
    private String controlBar;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getControlBar() {
        return controlBar;
    }

    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }

    @Override
    public String toString() {
        return "Player{" +
                "menu='" + menu + '\'' +
                ", list='" + list + '\'' +
                ", windows='" + windows + '\'' +
                ", controlBar='" + controlBar + '\'' +
                '}';
    }
}
