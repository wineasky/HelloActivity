package com.example.helloactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    public final static String EXTRA_MESSAGE = "com.example.helloactivity.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("test", "onCreate");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("test", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("test", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("test", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("test", "onDestroy");
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
