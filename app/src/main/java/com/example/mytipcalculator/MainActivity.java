package com.example.mytipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void calculate(View v){
        // get references to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);

        NumberFormat formatter = new DecimalFormat("##.00");

        // get the values from the EditText boxes and convert them to int data types
        double num1 = Integer.parseInt(num1EditText.getText().toString());
        int num2 = Integer.parseInt(num2EditText.getText().toString());

        // calculate total through two ints
        double tip = (num2*.01) * num1;
        double cost = tip + num1;


        tipTextView.setText("Tip: $" + formatter.format(tip));
        ansTextView.setText("Final Cost: $" + formatter.format(cost));
    }

}
