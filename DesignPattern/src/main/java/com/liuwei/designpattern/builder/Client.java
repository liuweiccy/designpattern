package com.liuwei.designpattern.builder;


public class Client {
    public static void main(String[] args) {
        ActorController actorController = new ActorController();
        Actor actor = actorController.construct(new AngleBuilder());
        System.out.println(actor);
    }
}
