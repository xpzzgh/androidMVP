package com.example.pz.androidmvppractice.biz;

import com.example.pz.androidmvppractice.bean.User;

/**
 * Created by pz on 2016/8/6.
 */
public interface IloginListener {
    void success(User user);
    void fail();
}
