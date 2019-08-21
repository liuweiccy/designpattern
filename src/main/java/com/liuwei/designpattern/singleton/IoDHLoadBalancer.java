package com.liuwei.designpattern.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IoDHLoadBalancer {
    private List<String> serverList;

    private IoDHLoadBalancer() {
        serverList = new ArrayList<String>();
    }

    private static class HolderClass {
        private final static IoDHLoadBalancer instance = new IoDHLoadBalancer();
    }

    public static IoDHLoadBalancer getLoadBalancer() {
        return HolderClass.instance;
    }

    public void addServer(String server) {
        serverList.add(server);
    }

    public void removeServer(String server) {
        serverList.remove(server);
    }

    public String getServer() {
        Random random = new Random();
        int randomNum = random.nextInt(serverList.size());
        return serverList.get(randomNum);
    }
}
