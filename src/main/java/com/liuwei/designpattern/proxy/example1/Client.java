package com.liuwei.designpattern.proxy.example1;

public class Client {

    public static void main(String[] args) {
        // 可以增加不同的代理，来进行真实对象的访问控制
        Searcher searcher = new SearchProxy();
        searcher.doSearch("liu", "coder");
    }
}
