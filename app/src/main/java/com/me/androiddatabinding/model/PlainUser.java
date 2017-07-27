package com.me.androiddatabinding.model;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by tao.liu on 2017/7/27.
 */

public class PlainUser {
        public final ObservableField<String> firstName = new ObservableField<>();
        public final ObservableField<String> lastName = new ObservableField<>();
        public final ObservableInt age = new ObservableInt();

}
