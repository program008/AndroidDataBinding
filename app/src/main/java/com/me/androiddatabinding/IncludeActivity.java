package com.me.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.me.androiddatabinding.databinding.ActivityIncludeBinding;
import com.me.androiddatabinding.listener.OkListener;
import com.me.androiddatabinding.model.User;

public class IncludeActivity extends AppCompatActivity implements OkListener {

        private ActivityIncludeBinding binding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
               // setContentView(R.layout.activity_include);
                binding = DataBindingUtil.setContentView(this, R.layout.activity_include);
                binding.setListener(this);
                binding.setOkText("to toast");

                binding.layoutInput.etName.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                                User user = new User(charSequence.toString(),"Lau");
                                binding.setUser(user);
                        }

                        @Override
                        public void afterTextChanged(Editable editable) {

                        }
                });
        }

        @Override
        public void onClickOk(View view) {
                Toast.makeText(this, "the btn clicked", Toast.LENGTH_SHORT).show();
        }
}
