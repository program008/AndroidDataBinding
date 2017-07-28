package com.me.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.me.androiddatabinding.databinding.ActivityCustomBindingBinding;
import com.me.androiddatabinding.model.Contact;

public class CustomBindingActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                //setContentView(R.layout.activity_custom_binding);
                ActivityCustomBindingBinding binding = DataBindingUtil.setContentView(this,
                        R.layout.activity_custom_binding);
                Contact contact = new Contact("122133322323","深圳");
                binding.setContact(contact);

        }
}
