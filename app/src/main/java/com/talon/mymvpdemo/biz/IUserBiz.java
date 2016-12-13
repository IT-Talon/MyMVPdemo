package com.talon.mymvpdemo.biz;

/**
 * Created by HP on 2016/12/13.
 */

public interface IUserBiz {
    public void login(String username, String password, OnLoginListener loginListener);
}
