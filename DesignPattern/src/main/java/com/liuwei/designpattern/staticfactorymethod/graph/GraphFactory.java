package com.liuwei.designpattern.staticfactorymethod.graph;

import static com.liuwei.designpattern.staticfactorymethod.graph.ShapeConstant.CIRCLE;
import static com.liuwei.designpattern.staticfactorymethod.graph.ShapeConstant.RECTANGLE;
import static com.liuwei.designpattern.staticfactorymethod.graph.ShapeConstant.TRIANGLE;

public class GraphFactory {

    public static Graph getGraph(String graphName) throws UnSupportedShapeException {
        switch (graphName) {
            case CIRCLE :
                return new Circle();
            case RECTANGLE :
                return new Rectangle();
            case TRIANGLE :
                return new Triangle();
            default:
                throw new UnSupportedShapeException("The " + graphName + " shape unsupported!");
        }
    }
}
