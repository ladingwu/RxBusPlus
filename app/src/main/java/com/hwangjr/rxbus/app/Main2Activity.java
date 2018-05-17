package com.hwangjr.rxbus.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.hwangjr.rxbus.RxBus;
import com.hwangjr.rxbus.annotation.StrickSubscribe;
import com.hwangjr.rxbus.annotation.Tag;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RxBus.get().register(this);
    }

    @StrickSubscribe(tags = {@Tag("haha")})
    public void onEvent(String event){
        Log.i("onevent",event);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        RxBus.get().unregister(this);
    }
}
