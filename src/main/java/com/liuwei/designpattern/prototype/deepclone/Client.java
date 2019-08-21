package com.liuwei.designpattern.prototype.deepclone;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        WeeklyLog log = new WeeklyLog();
        log.setName("lw");
        log.setDate("10-5");
        log.setContent("学习原型模式");
        Attachment attachment = new Attachment();
        attachment.setName("表格");
        log.setAttachment(attachment);
        System.out.println(log.toString());
        WeeklyLog log1 = log.deepclone();
        System.out.println(log == log1);
        System.out.println(log.getAttachment() == log1.getAttachment());
        System.out.println(log1.toString());
    }
}
