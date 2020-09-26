package com.example.amalifesimulator;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String firstName;
    private String lastName;
    private Integer choice;
    private Integer semester_number;

    private Person player;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        Intent intent = getIntent();

        firstName = intent.getStringExtra("firstName");
        lastName = intent.getStringExtra("lastName");
        choice = intent.getIntExtra("choice", 0);
//
//        player = new Person(firstName, lastName, getHealth(), 0, 0, 0);
        semester_number = new Integer(1);
    }

    @Override
    protected void onStart () {
        super.onStart();
    }

//    private Integer getHealth () {
//        switch (choice) {
//            case 0:
//                return 85;
//            case 1:
//                return 70;
//            case 2:
//                return 65;
//            case 3:
//                return 75;
//        }
//    }
}
