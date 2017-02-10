package com.example.nico.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Nicolò on 07/02/2017.
 */

public class MainActivity extends Activity implements View.OnClickListener{
    String tag = "MainActivity";
    Button callBtn;
    Button goBtn;
    TextView phoneNumber,location;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneNumber= (TextView) findViewById(R.id.number_TV);
        location = (TextView) findViewById(R.id.location_TV);
        callBtn = (Button) findViewById(R.id.call_BTN);
        goBtn = (Button) findViewById(R.id.go_BTN);
        callBtn.setOnClickListener(this);
        goBtn.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy");
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.call_BTN){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("tel:"+phoneNumber.getText().toString());
            intent.setData(uri);
            startActivity(intent);
        }
        else if(v.getId() == R.id.go_BTN){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("geo:0,0?q="+location.getText().toString());
            intent.setData(uri);
            startActivity(intent);
        }
    }
}
