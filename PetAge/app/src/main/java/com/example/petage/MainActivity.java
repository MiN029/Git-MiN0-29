package com.example.petage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    Button btnSubmit;
    EditText tvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txtResult);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvNumber = findViewById(R.id.tvNumber);

        txtResult.setVisibility(View.GONE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int petAge = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(tvNumber.getText().toString().trim());
                txtResult.setText(petAge + " Year old");
                txtResult.setVisibility(View.VISIBLE);
            }
        });

    }
}