package com.example.li.mytest.mvp.modle.biz;

import com.example.li.mytest.mvp.modle.bean.User;

/**
 * Created by li
 * 15/11/4.
 */
public interface OnLoginListener {
    void loginSuccess(User user);
    void LoginFailed();
}
