package com.example.pz.androidmvppractice.view;

/**
 * Created by pz on 2016/8/6.
 */
public interface ILoginView {
    String getUserName();
    String getPassword();
    String clearUserName();
    String clearPassword();
    void showLoading();
    void hideLoding();
    void toMainActivity();
    void failLogin();
    void finishLoading();
}
