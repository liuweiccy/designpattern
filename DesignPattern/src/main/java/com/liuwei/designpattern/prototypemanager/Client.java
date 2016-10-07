package com.liuwei.designpattern.prototypemanager;

public class Client {
    public static void main(String[] args) {
        PrototypeManager pm = PrototypeManager.getPrototypeManager();
        OfficialDocument srs = pm.getOfficialDocument("srs");
        OfficialDocument srs1 = pm.getOfficialDocument("srs");
        System.out.println(srs == srs1);
        OfficialDocument far = pm.getOfficialDocument("far");
        OfficialDocument far1 = pm.getOfficialDocument("far");
        System.out.println(far == far1);
        pm.addOfficialDocument("ppr", new PPR());
        OfficialDocument ppr = pm.getOfficialDocument("ppr");
        OfficialDocument ppr1 = pm.getOfficialDocument("ppr");
        System.out.println(ppr);
    }
}
