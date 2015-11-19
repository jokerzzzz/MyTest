package com.example.li.mytest.mvp.modle.biz;

/**
 * Created by li
 * 15/11/4.
 */
public interface IUserBiz {
    void loading(String username, String password, OnLoginListener onLoginListener);
}
