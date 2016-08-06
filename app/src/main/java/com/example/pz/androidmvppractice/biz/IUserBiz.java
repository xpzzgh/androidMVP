package com.example.pz.androidmvppractice.biz;

/**
 * Created by pz on 2016/8/6.
 */
public interface IUserBiz {
    void login(String userName, String password, IloginListener loginListener);
}
