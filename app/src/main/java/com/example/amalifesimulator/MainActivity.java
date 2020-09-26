package com.example.amalifesimulator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Person player;
    private TextView characterAgeTextView;
    private TextView characterMoneyTextView;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        // getting the player's last and first names from the intent
        Intent intent = getIntent();
        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        Integer sex = intent.getIntExtra("sex", 0);

        player = new Person(firstName, lastName, 0, 100, 0, sex);
    }

    @Override
    protected void onStart () {
        super.onStart();

        TextView characterNameTextView = findViewById(R.id.characterNameTextView);
        characterAgeTextView = findViewById(R.id.characterAgeTextView);
        characterMoneyTextView = findViewById(R.id.characterMoneyTextView);

        String temp = player.getFirstName() + " " + player.getLastName();
        characterNameTextView.setText(temp);
        characterAgeTextView.setText(player.getAge().toString());
        characterMoneyTextView.setText(player.getMoney().toString());
    }

    public void incrementAge (View view) {
        player.incrementAge();
        characterAgeTextView.setText(player.getAge().toString());
        characterMoneyTextView.setText(player.getMoney().toString());

        AlertDialog.Builder educationDialog = new AlertDialog.Builder(MainActivity.this);
        educationDialog.setTitle(R.string.educationAlertTitle);
        educationDialog.setPositiveButton(R.string.educationAlertPositiveButtonText, null);

        switch (player.getAge()) {
            case 5:
                educationDialog.setMessage(R.string.elementarySchoolAlertTitle);
                educationDialog.show();
                break;
            case 11:
                educationDialog.setMessage(R.string.middleSchoolAlertTitle);
                educationDialog.show();
                break;
            case 14:
                educationDialog.setMessage(R.string.highSchoolAlertTitle);
                educationDialog.show();
                break;
        }

    }

    private void deathFromOldAge () {
        if (player.getAge() == 70) {
            switch (player.getSex()) {
                case 0:

                    break;
                case 1:
                    break;
            }
        }
    }

    private void death() {

    }
}
