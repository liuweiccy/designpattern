package com.liuwei.designpattern.builder;

public class AngleBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("天使脸");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("飘飘长裙");
    }

    @Override
    public void buildHair() {
        actor.setHairstyle("飘飘长发");
    }
}
