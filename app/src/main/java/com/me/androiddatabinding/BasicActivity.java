package com.me.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.me.androiddatabinding.databinding.ActivityBasicBinding;
import com.me.androiddatabinding.model.User;

/**
 * Created by tao.liu on 2017/7/27.
 */

public class BasicActivity extends AppCompatActivity{

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                ActivityBasicBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_basic);
                User user = new User("lambda","lau",18);
                dataBinding.setUser(user);
        }
}
