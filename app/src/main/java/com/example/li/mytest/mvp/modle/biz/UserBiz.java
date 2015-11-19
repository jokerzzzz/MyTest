package com.example.li.mytest.mvp.modle.biz;

import com.example.li.mytest.mvp.modle.bean.User;

/**
 * Created by li
 * 15/11/4.
 */
public class UserBiz implements IUserBiz {
    @Override
    public void loading(final String username, final String password, final OnLoginListener onLoginListener) {
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if ("lixuan".equals(username) && "123".equals(password)){
                    User user = new User();
                    user.setUserName(username);
                    user.setPassword(password);
                    onLoginListener.loginSuccess(user);
                }else {
                    onLoginListener.LoginFailed();
                }
            }
        }.start();
    }
}
