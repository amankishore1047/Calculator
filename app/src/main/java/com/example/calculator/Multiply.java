package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Multiply extends AppCompatActivity {
    TextView product;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiply);
        product = findViewById(R.id.product);
        int res = getIntent().getExtras().getInt("multiplication");
        product.setText("The product is = " + res);
    }
}