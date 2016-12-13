package com.talon.mymvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.talon.mymvpdemo.bean.User;
import com.talon.mymvpdemo.presenter.UserLoginPresenter;
import com.talon.mymvpdemo.view.IUserLoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements IUserLoginView {

    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_clear)
    Button btnClear;
    @BindView(R.id.pb_loading)
    ProgressBar pbLoading;

    private UserLoginPresenter mUserLoginPresenter = new UserLoginPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
    }

    @Override
    public String getUserName() {
        return etUsername.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return etPassword.getText().toString().trim();
    }

    @Override
    public void clearUserName() {
        etUsername.setText("");

    }

    @Override
    public void clearPassword() {
        etPassword.setText("");

    }

    @Override
    public void showLoading() {
        pbLoading.setVisibility(View.VISIBLE);

    }

    @Override
    public void hideLoading() {
        pbLoading.setVisibility(View.GONE);

    }

    @Override
    public void toMainActivity(User user) {
        Toast.makeText(this, user.getUsername() + "login success,to MainActivity!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailedError() {
        Toast.makeText(this, "login failed!", Toast.LENGTH_SHORT).show();
    }

    @OnClick({R.id.btn_login, R.id.btn_clear})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                mUserLoginPresenter.login();
                break;
            case R.id.btn_clear:
                mUserLoginPresenter.clear();
                break;
        }
    }
}
