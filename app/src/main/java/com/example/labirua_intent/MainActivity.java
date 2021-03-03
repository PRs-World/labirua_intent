 package com.example.labirua_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next1 = findViewById(R.id.buttonProceed);
        Button next2 = findViewById(R.id.buttonProceed);

        next1.setOnClickListener(this);
        next1.setOnClickListener(this);


    }
    @Override
     public void onClick(View v){

        EditText input = findViewById(R.id.textMonthValue);

        Intent i = new Intent(MainActivity.this,Activity2.class);

        startActivity(i);

        int monthCount=Integer.parseInt(String.valueOf(input.getText()));



        switch(v.getId()) {
            case R.id.buttonProceed:

                i.putExtra("Int_Months", monthCount);


                startActivity(i);
                break;


        }

    }
}