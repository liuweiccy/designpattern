package com.liuwei.designpattern.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LazyLoadBalancer {
    private volatile static LazyLoadBalancer loadBalancer = null;
    private List<String> serverList;

    private LazyLoadBalancer() {
        serverList = new ArrayList<String>();
    }

    public static LazyLoadBalancer getLoadBalancer() {
        if (loadBalancer == null) {
            synchronized (LazyLoadBalancer.class){
                if (loadBalancer == null) {
                    loadBalancer = new LazyLoadBalancer();
                }
            }
        }
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
