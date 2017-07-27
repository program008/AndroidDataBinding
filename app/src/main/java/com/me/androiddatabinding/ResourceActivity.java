package com.me.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.me.androiddatabinding.databinding.ActivityResourceBinding;

public class ResourceActivity extends AppCompatActivity {

        private ActivityResourceBinding resourceBinding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                //setContentView(R.layout.activity_resource);
                resourceBinding = DataBindingUtil.setContentView(this, R.layout.activity_resource);
                resourceBinding.setLarge(true);
                resourceBinding.setFirstName("Lambda");
                resourceBinding.setLastName("Lau");
                resourceBinding.setBananaCount(5);
                resourceBinding.setOrangeCount(5);
        }
}
