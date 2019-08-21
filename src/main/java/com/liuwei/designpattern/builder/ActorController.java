package com.liuwei.designpattern.builder;

public class ActorController {
    public Actor construct(ActorBuilder actorBuilder) {
        actorBuilder.buildType();
        actorBuilder.buildCostume();
        actorBuilder.buildFace();
        actorBuilder.buildHair();
        actorBuilder.buildSex();
        return actorBuilder.createActor();
    }
}
