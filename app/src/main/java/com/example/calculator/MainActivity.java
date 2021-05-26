package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int a,b;
    EditText n1,n2;
    private Button button, button2, button3, button4;
    public static final String SUM = "addition";
    public static final String SUBTRACT = "subtraction";
    public static final String MULTIPLY = "multiplication";
    public static final String DIVIDE = "division";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

    }

    public void openAdd(View v){
        Toast.makeText(this, "Hurray !! Addition ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Add.class);
        a = Integer.parseInt(n1.getText().toString());
        b = Integer.parseInt(n2.getText().toString());
        button = (Button)findViewById(R.id.button);
        int c = a+b;
        intent.putExtra("addition", c);
        startActivity(intent);

    }

    public void openSubstract(View v){

        Toast.makeText(this, "Hurray !! Subtraction", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Substrct.class);
        a = Integer.parseInt(n1.getText().toString());
        b = Integer.parseInt(n2.getText().toString());
        button2 = (Button) findViewById(R.id.button2);
        int c = a-b;
        intent.putExtra("subtraction",c);
        startActivity(intent);

    }

    public void openMultiply(View v){

        Intent i = new Intent(this, Multiply.class);
        a = Integer.parseInt(n1.getText().toString());
        b = Integer.parseInt(n2.getText().toString());
        button3 = (Button) findViewById(R.id.button3);
        int c = a*b;
        i.putExtra("multiplication",c);
        startActivity(i);;

    }

    public void openDivide(View v){
        Intent i = new Intent(this, Divide.class);
        a = Integer.parseInt(n1.getText().toString());
        b = Integer.parseInt(n2.getText().toString());
        if(b == 0){
            Toast.makeText(this, "b cannot be zero please change the value of b", Toast.LENGTH_SHORT).show();
        }
        button4 = findViewById(R.id.button4);
        int c = a/b;
        i.putExtra("division",c);
        startActivity(i);
    }
}