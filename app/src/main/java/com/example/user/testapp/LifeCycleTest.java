package com.example.user.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LifeCycleTest extends Activity{
    StringBuilder builder = new StringBuilder();
    TextView textView;

    private void log(String text){
        Log.d("LifeCycleTest", text);
        builder.append(text);
        builder.append('\n');
        textView.setText(builder.toString());
    }

    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life_cycle_test);
        textView = (TextView) findViewById(R.id.txt);
        textView.setText(builder.toString());
        log("created");
    }

    protected void onResume(){
        super.onResume();
        log("resumed");
    }

    protected void onPause(){
        super.onPause();
        log("paused");
        if(isFinishing()){
            log("finishing");
        }

    }

}
