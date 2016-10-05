package com.liuwei.designpattern.prototype.jdkclone;

public class WeeklyLog implements Cloneable{
    private String name;
    private String date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "WeeklyLog{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
