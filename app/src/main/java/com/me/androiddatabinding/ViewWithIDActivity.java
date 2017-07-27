package com.me.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.me.androiddatabinding.databinding.ActivityViewWithIdBinding;

public class ViewWithIDActivity extends AppCompatActivity {

        private ActivityViewWithIdBinding binding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                //setContentView(R.layout.activity_view_with_id);
                binding = DataBindingUtil.setContentView(this, R.layout.activity_view_with_id);
        }

        public void showName(View view) {
                binding.firstName.setText("Lambda");
                binding.lastName.setText("Lau");
        }
}
