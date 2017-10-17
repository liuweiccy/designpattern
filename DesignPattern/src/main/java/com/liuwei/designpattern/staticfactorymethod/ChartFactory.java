package com.liuwei.designpattern.staticfactorymethod;

public class ChartFactory {

    public static Chart getChart(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Chart chart;
        Class<Chart> c = (Class<Chart>) Class.forName(type);
        chart = c.newInstance();
        return chart;
    }

    public static Chart getChart2(String type) {
        Chart chart = null;
        if ("pie".equalsIgnoreCase(type)) {
            chart = new PieChart();
            System.out.println("初始化PieChart图");
        } else if ("history".equalsIgnoreCase(type)) {
            chart = new HistoryChart();
            System.out.println("初始化HistoryChart图");
        } else if ("line".equalsIgnoreCase(type)) {
            chart = new LineChart();
            System.out.println("初始化LineChart图");
        }
        return chart;
    }
}
