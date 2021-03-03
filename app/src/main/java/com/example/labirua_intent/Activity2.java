package com.example.labirua_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button back = findViewById(R.id.buttonBack);
        back.setOnClickListener(this);

        boolean condition;
        int x;

        Intent i = getIntent();
        x = i.getIntExtra("Int_Months",0);

        TextView display = findViewById(R.id.textView);

        switch(x){
            case 1:
                display.setText("That value is assigned to January.");
                break;
            case 2:
                display.setText("That value is assigned to February.");
                break;
            case 3:
                display.setText("That value is assigned to March.");
                break;
            case 4:
                display.setText("That value is assigned to April.");
                break;
            case 5:
                display.setText("That value is assigned to May.");
                break;
            case 6:
                display.setText("That value is assigned to June.");
                break;
            case 7:
                display.setText("That value is assigned to July.");
                break;
            case 8:
                display.setText("That value is assigned to August.");
                break;
            case 9:
                display.setText("That value is assigned to September.");
                break;
            case 10:
                display.setText("That value is assigned to October.");
                break;
            case 11:
                display.setText("That value is assigned to November.");
                break;
            case 12:
                display.setText("That value is assigned to December.");
                break;

            default:
                display.setText("ERROR: That month doesn't exist.");
                break;
        }


    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(Activity2.this, MainActivity.class);

        startActivity(i);

        switch(v.getId()) {
            case R.id.buttonBack:

                startActivity(i);
                break;
        }
    }
}