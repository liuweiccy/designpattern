package com.liuwei.designpattern.proxy.example2;

public class UserDAO implements AbstractUserDAO {
    @Override
    public boolean findUserById(String userId) {
        System.out.println("找到玩家：" + userId);
        return false;
    }
}
