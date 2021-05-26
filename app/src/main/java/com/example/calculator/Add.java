package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Add extends AppCompatActivity {
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        result = findViewById(R.id.result);
//        Intent intent = getIntent();
//        int c = 0;
        int res = getIntent().getExtras().getInt("addition");
        result.setText("The sum is = " + res);
    }
}