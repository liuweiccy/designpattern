package com.liuwei.designpattern.staticfactorymethod;

import com.liuwei.designpattern.util.XMLUtil;

public class Client {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Chart chart = ChartFactory.getChart("com.liuwei.designpattern.staticfactorymethod.PieChart");
        chart.display();
        chart = ChartFactory.getChart2(XMLUtil.getChartType("chartType"));
        chart.display();
        System.out.println(chart.toString());
    }
}
