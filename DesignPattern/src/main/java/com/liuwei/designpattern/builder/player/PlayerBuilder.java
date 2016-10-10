package com.liuwei.designpattern.builder.player;

public abstract class PlayerBuilder {
    private Player player = new Player();

    public abstract void buildMenu();
    public abstract void buildList();
    public abstract void buildWindows();
    public abstract void buildControlBar();

    public Player createPlayer() {
        return player;
    }
}
