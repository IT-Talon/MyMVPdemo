package com.talon.mymvpdemo.view;

import com.talon.mymvpdemo.bean.User;

/**
 * Created by HP on 2016/12/13.
 */

public interface IUserLoginView {
    String getUserName();

    String getPassword();

    void clearUserName();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void toMainActivity(User user);

    void showFailedError();
}
