package com.example.buttonhandling;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout Ll;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ll = findViewById(R.id.Ll);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundColor(Color.CYAN);
                Ll.setBackgroundColor(Color.RED);
                btnSubmit.setBackgroundColor(Color.BLACK);
            }
        });
    }

//    public void btnOnClick(View button){
//        button.setBackgroundColor(Color.RED);
//        findViewById(R.id.Ll).setBackgroundColor(Color.BLACK);
//    }


}