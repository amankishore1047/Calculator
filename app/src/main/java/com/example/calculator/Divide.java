package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Divide extends AppCompatActivity {
    TextView quotient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide);
        quotient = findViewById(R.id.quotient);
        int res = getIntent().getExtras().getInt("division");
        quotient.setText("The result is = " + res);

    }
}