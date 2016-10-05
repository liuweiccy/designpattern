package com.liuwei.designpattern.singleton;

public class Client {
    public static void main(String[] args) {
        LoadBalancer loadBalancer1,loadBalancer2,loadBalancer3,loadBalancer4;
        loadBalancer1 = LoadBalancer.getLoadBalancer();
        loadBalancer2 = LoadBalancer.getLoadBalancer();
        loadBalancer3 = LoadBalancer.getLoadBalancer();
        loadBalancer4 = LoadBalancer.getLoadBalancer();

        if (loadBalancer1 == loadBalancer2 && loadBalancer2 == loadBalancer3 && loadBalancer3 == loadBalancer4) {
            System.out.println("服务器具有唯一性");
        }

        loadBalancer1.addServer("Server1");
        loadBalancer2.addServer("Server2");
        loadBalancer3.addServer("Server3");
        loadBalancer4.addServer("Server4");
        loadBalancer1.addServer("Server5");
        loadBalancer3.removeServer("Server5");

        for (int i = 0; i < 20; i++) {
            String server = loadBalancer1.getServer();
            System.out.println("请求分发至：" + server);
        }
    }

}
