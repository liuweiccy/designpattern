package com.liuwei.designpattern.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EagerLoadBalancer {
    private final static EagerLoadBalancer loadBalancer = new EagerLoadBalancer();
    private List<String> serverList;

    private EagerLoadBalancer() {
        serverList = new ArrayList<String>();
    }

    public static EagerLoadBalancer getLoadBalancer() {
        return loadBalancer;
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
