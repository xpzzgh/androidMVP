package com.example.pz.androidmvppractice.presenter;

import android.app.Activity;
import android.os.Handler;

import com.example.pz.androidmvppractice.bean.User;
import com.example.pz.androidmvppractice.biz.IUserBiz;
import com.example.pz.androidmvppractice.biz.IloginListener;
import com.example.pz.androidmvppractice.biz.UserBiz;
import com.example.pz.androidmvppractice.view.ILoginView;

/**
 * Created by pz on 2016/8/6.
 */
public class LoginPresenter {
    IUserBiz userBiz;
    ILoginView loginView;
    Handler handler;

    public LoginPresenter(ILoginView loginView) {
        userBiz = new UserBiz();
        this.loginView = loginView;
        handler = new Handler();
    }

    public void login() {
        loginView.showLoading();
        userBiz.login(loginView.getUserName(), loginView.getPassword(), new IloginListener() {
            @Override
            public void success(User user) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        loginView.finishLoading();
                        loginView.toMainActivity();
                        loginView.hideLoding();
                    }
                });
            }

            @Override
            public void fail() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        loginView.failLogin();
                        loginView.hideLoding();
                    }
                });
            }
        });
    }


}
