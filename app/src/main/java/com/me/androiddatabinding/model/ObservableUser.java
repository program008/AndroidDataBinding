package com.me.androiddatabinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.me.androiddatabinding.BR;

/**
 * Created by tao.liu on 2017/7/27.
 */

public class ObservableUser extends BaseObservable {
        private String mFirstName;
        private String mLastName;

        @Bindable
        public String getFirstName() {
                return mFirstName;
        }

        @Bindable
        public String getLastName() {
                return mLastName;
        }

        public void setFirstName(String firstName) {
                mFirstName = firstName;
                notifyPropertyChanged(BR.firstName);
        }

        public void setLastName(String lastName) {
                mLastName = lastName;
                notifyPropertyChanged(BR.lastName);
        }
}
