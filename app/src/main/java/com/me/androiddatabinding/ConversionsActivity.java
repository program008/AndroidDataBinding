package com.me.androiddatabinding;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableBoolean;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.me.androiddatabinding.databinding.ActivityConversionsBinding;
import com.me.androiddatabinding.util.ScreenUtils;

public class ConversionsActivity extends AppCompatActivity {

        private ObservableBoolean isError = new ObservableBoolean();

        private ActivityConversionsBinding conversionsBinding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                //setContentView(R.layout.activity_conversions);
                conversionsBinding = DataBindingUtil.setContentView(this, R.layout.activity_conversions);

                isError.set(true);
                conversionsBinding.setIsOpen(isError);
                conversionsBinding.setHeight(ScreenUtils.dp2px(this,200));
        }

        public void toggleIsError(View view) {
                isError.set(!isError.get());
        }

        @BindingConversion
        public static ColorDrawable convertColorToDrawable(int color) {
                return new ColorDrawable(color);
        }

        @BindingAdapter("layout_height")
        public static void setLayoutHeight(View view, float height) {
                ViewGroup.LayoutParams params = view.getLayoutParams();
                params.height = (int) height;
                view.setLayoutParams(params);
        }
        /** !!! Binding conversion should be forbidden, otherwise it will conflict with
         *  {@code android:visiblity} attribute.
         */
    /*
    @BindingConversion
    public static int convertColorToString(int color) {
        switch (color) {
            case Color.RED:
                return R.string.red;
            case Color.WHITE:
                return R.string.white;
        }
        return R.string.app_name;
    }*/
}
