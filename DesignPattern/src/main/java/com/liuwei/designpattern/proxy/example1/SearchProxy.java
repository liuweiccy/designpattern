package com.liuwei.designpattern.proxy.example1;

public class SearchProxy implements Searcher {

    private Searcher searcher;
    private Log logs;
    private Volicate volicate;

    public SearchProxy() {
        searcher = new RealSearcher();
    }

    @Override
    public void doSearch(String userId, String key) {
        volivate(userId);
        searcher.doSearch(userId, key);
        log(userId + "-------" + key);
    }

    public void log(String log) {
        logs = new Log();
        logs.log(log);
    }

    public void volivate(String userId) {
        volicate = new Volicate();
        volicate.volivate(userId);
    }
}
