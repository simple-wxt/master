package com.kpi.activity;

import android.os.Bundle;

import com.storm.kpi.R;

/**
 * 填写密码
 */
public class PassWordActivity extends BasePassWordActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_pass_word;
    }
}
