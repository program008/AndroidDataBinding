package com.me.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.me.androiddatabinding.databinding.ActivityObservableBinding;
import com.me.androiddatabinding.model.ObservableUser;
import com.me.androiddatabinding.model.PlainUser;

public class ObservableActivity extends AppCompatActivity {

        private ObservableUser user = new ObservableUser();
        private PlainUser plainUser = new PlainUser();
        private ObservableArrayMap<String,Object> mapUser = new ObservableArrayMap<>();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
//                setContentView(R.layout.activity_observable);
               ActivityObservableBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_observable);
                setMyName(null);
                binding.setUser(user);
                binding.setPlainUser(plainUser);
                binding.setMapUser(mapUser);


        }

        public void setOtherName(View view) {
                user.setFirstName("zhang");
                user.setLastName("san");

                plainUser.firstName.set("zhang");
                plainUser.lastName.set("san");
                plainUser.age.set(21);

                mapUser.put("firstName","zhang");
                mapUser.put("lastName","san");
                mapUser.put("age",21);
        }

        public void setMyName(View view) {
                user.setFirstName("lambda");
                user.setLastName("lau");

                plainUser.firstName.set("lambda");
                plainUser.lastName.set("lau");
                plainUser.age.set(21);

                mapUser.put("firstName","lambda");
                mapUser.put("lastName","lau");
                mapUser.put("age",21);
        }
}
