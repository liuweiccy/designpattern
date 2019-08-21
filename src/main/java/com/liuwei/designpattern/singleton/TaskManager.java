package com.liuwei.designpattern.singleton;

/**
 * 普通的单例模式
 * 缺点：在多线程的调用下可能会创建多个的对象
 *
 * Created by LiuWei on 2016/9/14.
 */
public class TaskManager {
    private static TaskManager ourInstance;

    public static TaskManager getInstance() {
        if (ourInstance == null) {
            ourInstance = new TaskManager();
        }
        return ourInstance;
    }

    private TaskManager() {
    }
}
