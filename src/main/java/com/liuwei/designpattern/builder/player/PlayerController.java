package com.liuwei.designpattern.builder.player;

public class PlayerController {
    public Player construct(PlayerBuilder playerBuilder) {
        playerBuilder.buildControlBar();
        playerBuilder.buildList();
        playerBuilder.buildMenu();
        playerBuilder.buildWindows();
        return playerBuilder.createPlayer();
    }
}
