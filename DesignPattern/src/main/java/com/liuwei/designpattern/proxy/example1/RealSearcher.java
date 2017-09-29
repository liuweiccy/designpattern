package com.liuwei.designpattern.proxy.example1;

public class RealSearcher implements Searcher {
    @Override
    public void doSearch(String userId, String key) {
        System.out.println("玩家:" + userId +"搜索到键" + key);
    }
}
