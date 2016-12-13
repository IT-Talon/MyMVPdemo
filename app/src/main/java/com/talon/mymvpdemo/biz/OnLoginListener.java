package com.talon.mymvpdemo.biz;

import com.talon.mymvpdemo.bean.User;

/**
 * Created by HP on 2016/12/13.
 */
public interface OnLoginListener {
    void loginSuccess(User user);

    void loginFailed();
}
