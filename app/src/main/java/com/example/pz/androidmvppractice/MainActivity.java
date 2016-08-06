package com.example.pz.androidmvppractice;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.pz.androidmvppractice.presenter.LoginPresenter;
import com.example.pz.androidmvppractice.view.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView{

    EditText userNameEdit;
    EditText passwordEdit;
    Button loginButton;
    ProgressBar loadingBar;
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    public void initView() {
        userNameEdit = (EditText) this.findViewById(R.id.userName_text);
        passwordEdit = (EditText) this.findViewById(R.id.password_text);
        loginButton = (Button)this.findViewById(R.id.login_button);
        loadingBar = (ProgressBar) this.findViewById(R.id.loading_bar);
        presenter = new LoginPresenter(this);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.login();
            }
        });
    }

    @Override
    public String clearPassword() {

        return null;
    }

    @Override
    public String getUserName() {
        return userNameEdit.getText().toString();
    }

    @Override
    public String getPassword() {
        return passwordEdit.getText().toString();
    }

    @Override
    public String clearUserName() {
        return null;
    }

    @Override
    public void showLoading() {
        loadingBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoding() {
        loadingBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void toMainActivity() {
        Snackbar.make(userNameEdit, "登陆成功", Snackbar.LENGTH_INDEFINITE).show();
    }

    @Override
    public void failLogin() {
        Snackbar.make(userNameEdit, "登陆失败", Snackbar.LENGTH_INDEFINITE).show();
    }

    @Override
    public void finishLoading() {
        loadingBar.setProgress(10);
    }
}
