package com.example.zhou.handlerdemo;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
;

public class MainActivity extends AppCompatActivity {
    Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {

            return false;
        }
    }){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
           // Toast.makeText(MainActivity.this,"zhuxiancheng",Toast.LENGTH_LONG).show();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Looper.prepare();
        Looper.loop();
        handler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this,Thread.currentThread().getName(),Toast.LENGTH_LONG).show();
            }
        });


    }



}
