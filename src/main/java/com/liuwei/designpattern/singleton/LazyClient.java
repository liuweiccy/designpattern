package com.liuwei.designpattern.singleton;

public class LazyClient {
    public static void main(String[] args) {
        LazyLoadBalancer loadBalancer1,loadBalancer2,loadBalancer3,loadBalancer4;
        loadBalancer1 = LazyLoadBalancer.getLoadBalancer();
        loadBalancer2 = LazyLoadBalancer.getLoadBalancer();
        loadBalancer3 = LazyLoadBalancer.getLoadBalancer();
        loadBalancer4 = LazyLoadBalancer.getLoadBalancer();

        if (loadBalancer1 == loadBalancer2 && loadBalancer2 == loadBalancer3 && loadBalancer3 == loadBalancer4) {
            System.out.println("服务器具有唯一性");
        }

        loadBalancer1.addServer("Server1");
        loadBalancer2.addServer("Server2");
        loadBalancer3.addServer("Server3");
        loadBalancer4.addServer("Server4");


        for (int i = 0; i < 8; i++) {
            String server = loadBalancer1.getServer();
            System.out.println("请求分发至：" + server);
        }
    }

}
