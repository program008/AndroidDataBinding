package com.me.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.me.androiddatabinding.databinding.ActivityViewStubBinding;
import com.me.androiddatabinding.databinding.ViewStubBinding;
import com.me.androiddatabinding.model.User;

public class ViewStubActivity extends AppCompatActivity {

        private ActivityViewStubBinding viewStubBinding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
//                setContentView(R.layout.activity_view_stub);
                viewStubBinding = DataBindingUtil.setContentView(this, R.layout.activity_view_stub);
                viewStubBinding.viewStub.setOnInflateListener((viewStub, view) -> {
                        ViewStubBinding binding = DataBindingUtil.bind(view);
                        User user = new User("lambda",": lau");
                        binding.setUser(user);
                });

        }

        public void inflateViewStub(View view) {
                if(!viewStubBinding.viewStub.isInflated()){
                        viewStubBinding.viewStub.getViewStub().inflate();
                }

        }
}
