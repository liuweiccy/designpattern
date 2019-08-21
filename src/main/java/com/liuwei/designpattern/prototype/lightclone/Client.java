package com.liuwei.designpattern.prototype.lightclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        WeeklyLog log = new WeeklyLog();
        log.setName("ccy");
        log.setDate("10-5");
        log.setContent("学习经济法");
        Attachment attachment = new Attachment();
        attachment.setName("表格");
        log.setAttachment(attachment);
        System.out.println(log.toString());
        WeeklyLog log1 = (WeeklyLog) log.clone();
        System.out.println(log == log1);
        System.out.println(log.getAttachment() == log1.getAttachment());
        System.out.println(log1.toString());
    }
}
