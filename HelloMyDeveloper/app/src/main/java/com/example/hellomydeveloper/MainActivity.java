package com.example.hellomydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.btnSubmit);
        txtResult = findViewById(R.id.txtResult);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnSubmit.setBackgroundColor(Color.GRAY);
                txtResult.setText("Hello I'm Developer android");

            }
        });


    }
}