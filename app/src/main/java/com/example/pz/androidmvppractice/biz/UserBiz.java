package com.example.pz.androidmvppractice.biz;

import com.example.pz.androidmvppractice.bean.User;

/**
 * Created by pz on 2016/8/6.
 */
public class UserBiz implements IUserBiz {
    @Override
    public void login(final String userName, final String password, final IloginListener loginListener) {
        Runnable loginRun = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                }catch (Exception e) {
                    e.printStackTrace();
                }
                if(userName.equals("xpz")&&password.equals("password")) {
                    User user = new User();
                    user.setUserName(userName).setPassword(password);
                    loginListener.success(user);
                }else {
                    loginListener.fail();
                }
            }
        };
        new Thread(loginRun).start();

    }
}
