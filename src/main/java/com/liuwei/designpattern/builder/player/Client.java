package com.liuwei.designpattern.builder.player;

import com.liuwei.designpattern.util.XMLUtil;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        PlayerController playerController = new PlayerController();
        Player player = playerController.construct((PlayerBuilder) Class.forName(XMLUtil.getChartType("builder1")).newInstance());
    }
}
