package com.me.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;

import com.me.androiddatabinding.databinding.ActivityCollectionBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                //setContentView(R.layout.activity_collection);
                ActivityCollectionBinding binding =
                        DataBindingUtil.setContentView(this,R.layout.activity_collection);

                String[] names = {"Lambda","Lau"};
                int index = 1;
                String key = "firstName";

                List<String> list = new ArrayList<>();
                SparseArray sparseArray = new SparseArray(2);
                for (int i = 0; i < names.length; i++) {
                        list.add(names[i]);
                        sparseArray.put(i,names[i]);
                }
                Map<String,String> map = new HashMap<>();
                map.put(key,"Lambda");
                map.put("lastName","Lau");

                binding.setIndex(index);
                binding.setKey(key);
                binding.setList(list);
                binding.setMap(map);
                binding.setSparse(sparseArray);
        }
}
