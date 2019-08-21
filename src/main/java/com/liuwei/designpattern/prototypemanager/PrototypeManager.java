package com.liuwei.designpattern.prototypemanager;

import java.util.Hashtable;

public class PrototypeManager {
    private static final PrototypeManager pm = new PrototypeManager();
    private Hashtable<String, OfficialDocument> ht = new Hashtable<String, OfficialDocument>();

    private PrototypeManager() {
        ht.put("srs", new SRS());
        ht.put("far", new FAR());
    }

    public static PrototypeManager getPrototypeManager() {
        return pm;
    }

    public void addOfficialDocument(String key, OfficialDocument document) {
        ht.put(key, document);
    }

    public OfficialDocument getOfficialDocument(String key) {
        return ht.get(key).clone();
    }
}
