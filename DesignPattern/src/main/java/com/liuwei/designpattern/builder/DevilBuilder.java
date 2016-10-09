package com.liuwei.designpattern.builder;

public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("魔");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("魔性时尚");
    }

    @Override
    public void buildHair() {
        actor.setHairstyle("光头");
    }
}
