package com.liuwei.designpattern.builder;


import com.liuwei.designpattern.util.XMLUtil;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ActorController actorController = new ActorController();
        ActorBuilder actorBuilder = (ActorBuilder) Class.forName(XMLUtil.getChartType("builder")).newInstance();
        Actor actor = actorController.construct(actorBuilder);
        System.out.println(actor);
    }
}
