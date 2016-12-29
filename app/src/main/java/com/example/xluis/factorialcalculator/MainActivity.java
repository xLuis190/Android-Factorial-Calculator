package com.example.xluis.factorialcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText editTextNumber;
    Button calculateButton;
    TextView factorialTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = (EditText) findViewById(R.id.numberInput);
        calculateButton = (Button) findViewById(R.id.calculateButton);
        factorialTextView = (TextView) findViewById(R.id.factorialText);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(String.valueOf(editTextNumber.getText()));
                number = calculateFactorial(number);

                factorialTextView.setText("The factorial for that number is "+number);
                factorialTextView.animate().alpha(1);


            }
        });
    }
    public int calculateFactorial(int number){
        int factorial = 1;
        for(int x = 1;x <= number;x++) {
            factorial = factorial * x;
        }
        return factorial;
    }
}
