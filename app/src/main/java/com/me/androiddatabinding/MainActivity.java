package com.me.androiddatabinding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        private Button btnObservable;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                Button btnBasic = (Button) findViewById(R.id.btn_basic);
                btnObservable = (Button) findViewById(R.id.btn_observable);
                Button btnViewId = (Button) findViewById(R.id.btn_viewid);
                Button btnViewStub = (Button) findViewById(R.id.btn_view_stub);
                Button btnConversion = (Button) findViewById(R.id.btn_conversion);
                Button btnResource = (Button) findViewById(R.id.btn_resource);
                Button btnCollection = (Button) findViewById(R.id.btn_collection);
                Button btnInclude = (Button) findViewById(R.id.btn_include);


                btnBasic.setOnClickListener(view ->
                        startActivity(new Intent(this, BasicActivity.class)));

                btnObservable.setOnClickListener(view ->
                startActivity(new Intent(this,ObservableActivity.class)));

                btnViewId.setOnClickListener(view ->
                startActivity(new Intent(this,ViewWithIDActivity.class)));

                btnViewStub.setOnClickListener(view ->
                startActivity(new Intent(this,ViewStubActivity.class)));

                btnConversion.setOnClickListener(view ->
                startActivity(new Intent(this,ConversionsActivity.class)));

                btnResource.setOnClickListener(view ->
                startActivity(new Intent(this,ResourceActivity.class)));

                btnCollection.setOnClickListener(view ->
                startActivity(new Intent(this,CollectionActivity.class)));

                btnInclude.setOnClickListener(view ->
                startActivity(new Intent(this,IncludeActivity.class)));

        }
}
