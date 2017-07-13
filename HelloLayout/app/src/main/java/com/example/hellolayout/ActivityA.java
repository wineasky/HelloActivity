package com.example.hellolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Button button =(Button)findViewById(R.id.button_a_name);//找到a中的bottom
        button.setOnClickListener( new Button.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();//Intent能连接两个不同的组件
                intent.setClass(ActivityA.this,ActivityB.class);//通过intent的方法从A.class跳转到B.class
                startActivity(intent);//运行b.class,通过onCreate里的setContentView读取@layout/activity_b.xml
                setTitle("ActivityB");//设置标题
                Log.i("ActivityAlog","click button");
            }
        });//设置Buttom的listener,用于点击
        Log.i("ActivityAlog","onCreate A" );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ActivityAlog","onStart A");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ActivityAlog","onPause A");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ActivityAlog","onDestroy A");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ActivityAlog","onResume A");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ActivityAlog","onStop A");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ActivityAlog","onRestart A");
    }
}
