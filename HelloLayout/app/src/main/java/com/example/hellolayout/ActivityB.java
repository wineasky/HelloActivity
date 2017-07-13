package com.example.hellolayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("ActivityB");
        setContentView(R.layout.activity_b);
        Log.i("ActivityBlog","onCreate B");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ActivityBlog","onStart B");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ActivityBlog","onPause B");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ActivityBlog","onDestroy B");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ActivityBlog","onResume B");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ActivityBlog","onStop B");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ActivityBlog","onRestart B");
    }
}
