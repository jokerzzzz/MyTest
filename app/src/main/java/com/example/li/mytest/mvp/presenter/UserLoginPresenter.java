package com.example.li.mytest.mvp.presenter;

import android.os.Handler;

import com.example.li.mytest.mvp.modle.bean.User;
import com.example.li.mytest.mvp.modle.biz.OnLoginListener;
import com.example.li.mytest.mvp.modle.biz.UserBiz;
import com.example.li.mytest.mvp.view.UserLoginView;

/**
 * Created by li
 * 15/11/4.
 */
public class UserLoginPresenter {
    private UserLoginView userLoginView;
    private UserBiz userBiz;
    private Handler handler = new Handler();

    public UserLoginPresenter(UserLoginView userLoginView) {
        this.userLoginView = userLoginView;
        this.userBiz = new UserBiz();
    }

    public void login(){
        userLoginView.showLoading();
        userBiz.loading(userLoginView.getUserName(), userLoginView.getPassWord(), new OnLoginListener() {
            @Override
            public void loginSuccess(User user) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.toMainActivity();
                        userLoginView.hideLoading();
                    }
                });
            }

            @Override
            public void LoginFailed() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.showFailedMsg();
                        userLoginView.hideLoading();
                    }
                });
            }
        });
    }

    public void clear(){
        userLoginView.clearPassWord();
        userLoginView.clearUserName();
    }
}
