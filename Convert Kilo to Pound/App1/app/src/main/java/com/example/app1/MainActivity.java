package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = findViewById(R.id.SubmitBtn);
        TextView text = findViewById(R.id.textView);
        EditText emailText = findViewById(R.id.email);
        Button submit2 = findViewById(R.id.btnSubmit2);
        TextView textView2 =findViewById(R.id.textView2);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1 = emailText.getText().toString();
                text.setText(text1);
            }
        });

        submit2.setText("Submit2");

        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text2 = emailText.getText().toString();
                textView2.setText(text2);
            }
        });
    }
}