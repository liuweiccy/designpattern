package com.liuwei.designpattern.staticfactorymethod.graph;

public class Client {
    public static void main(String[] args) {
        try {
            Graph graph = GraphFactory.getGraph(ShapeConstant.CIRCLE);
            graph.draw();
            graph.erase();
            graph = GraphFactory.getGraph("sdfasdf");
        } catch (UnSupportedShapeException e) {
            e.printStackTrace();
        }
    }
}
