package com.example.amalifesimulator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String firstName;
    private String lastName;
    private Integer choice;
    private Integer semesterNumber;

    private Person player;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_start);

        Intent intent = getIntent();

        firstName = intent.getStringExtra("firstName");
        lastName = intent.getStringExtra("lastName");
        choice = intent.getIntExtra("choice", 0);

        player = new Person(firstName, lastName, getHealth(), 0, 0, 0);
        semesterNumber = new Integer(1);
    }

    @Override
    protected void onStart () {
        super.onStart();

        TextView semesterTextView = findViewById(R.id.semesterTextView);
        TextView classCreditsCountTextView = findViewById(R.id.classCreditsCountTextView);
        TextView socialLifeCountTextView = findViewById(R.id.socialLifeCountTextView);
        TextView careerPointsCountTextView = findViewById(R.id.careerPointsCountTextView);
        TextView healthCountTextView = findViewById(R.id.healthCountTextView);

        semesterTextView.setText("Semester " + semesterNumber.toString());
        classCreditsCountTextView.setText(player.getCredits().toString());
        socialLifeCountTextView.setText(player.getSocialLifePoints().toString());
        careerPointsCountTextView.setText(player.getCareerPoints().toString());
        healthCountTextView.setText(player.getHealth().toString() + "%");
    }

    private Integer getHealth () {
        switch (choice) {
            case 0:
                return 85;
            case 1:
                return 70;
            case 2:
                return 65;
            case 3:
                return 75;
        }

        return 100;
    }
}
