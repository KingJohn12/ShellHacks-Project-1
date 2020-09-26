package com.example.amalifesimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class FirstActivity extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_first);

        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


    public void onNextButton (View view) {
        Intent secondActivityIntent = new Intent(this, SecondActivity.class);

        startActivity(secondActivityIntent);
    }
}