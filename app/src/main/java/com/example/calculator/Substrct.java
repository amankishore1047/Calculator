package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.calculator.MainActivity.SUBTRACT;

public class Substrct extends AppCompatActivity {
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_substrct);
        textView2 = findViewById(R.id.textView2);
//        Intent intent = new Intent();
//        int x = 1;
        int res = getIntent().getExtras().getInt("subtraction");
        textView2.setText("The difference is = " + res);


    }
}