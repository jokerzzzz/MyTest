package com.example.li.mytest.mvp.view;

/**
 * Created by li
 * 15/11/4.
 */
public interface UserLoginView {
    String getUserName();
    String getPassWord();
    void showLoading();
    void hideLoading();
    void toMainActivity();
    void showFailedMsg();
    void clearUserName();
    void clearPassWord();
}
