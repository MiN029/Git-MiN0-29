package com.example.convertkilotopounds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnCal;
    EditText textKilo;
    TextView calculateResult , pound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCal = findViewById(R.id.btnCal);
        textKilo = findViewById(R.id.textKilo);
        calculateResult = findViewById(R.id.calculateResult);
        pound = findViewById(R.id.pound);

        calculateResult.setVisibility(View.GONE);
        pound.setVisibility(View.GONE);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String convert = textKilo.getText().toString().trim();
                float kilo = Float.parseFloat(convert);
                float poundConvert = (float) (kilo * 2.20462262185);
                calculateResult.setText(""+poundConvert);

                calculateResult.setVisibility(View.VISIBLE);
                pound.setVisibility(View.VISIBLE);

            }
        });

    }
}