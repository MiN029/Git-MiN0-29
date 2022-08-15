package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button RollDive;
    ImageView Dive1;
    ImageView Dive2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RollDive = findViewById(R.id.RollDiveBtn);
        Dive1 = findViewById(R.id.imgdive1);
        Dive2 = findViewById(R.id.imgdive2);

        RollDive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randNum = new Random();
                int RandomNumber = randNum.nextInt(5);
                int RandomNumber2 = randNum.nextInt(5);
                int [] ImageView = {R.mipmap.dice1 , R.mipmap.dice2 , R.mipmap.dice3 , R.mipmap.dice4 ,
                                    R.mipmap.dice5 , R.mipmap.dice6};

                Dive1.setImageResource(ImageView[RandomNumber]);
                Dive2.setImageResource(ImageView[RandomNumber2]);

                Log.i("Dice app" , "The random number is 1: " + RandomNumber + " ");
                Log.i("Dice app" , "The random number is 2: " + RandomNumber2 + " ");
            }
        });
    }
}