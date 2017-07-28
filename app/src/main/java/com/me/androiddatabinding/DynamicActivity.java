package com.me.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.me.androiddatabinding.databinding.ActivityDynamicBinding;

public class DynamicActivity extends AppCompatActivity {

        private ActivityDynamicBinding binding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                //setContentView(R.layout.activity_dynamic);
                binding = DataBindingUtil.setContentView(this, R.layout.activity_dynamic);
                binding.recyclerView.setHasFixedSize(true);
                binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
                binding.recyclerView.setAdapter(new UserAdapter());
        }
}
