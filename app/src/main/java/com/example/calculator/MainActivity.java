package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ConstraintLayout background;
        Button button_plus;
        Button button_minus;
        Button button_div;
        Button button_mul;

        Button button_clear;

        EditText Number1;
        EditText Number2;

        TextView output;

        button_plus = (Button) findViewById(R.id.button_plus);
        button_mul = (Button) findViewById(R.id.button_mul);
        button_div = (Button) findViewById(R.id.button_div);
        button_minus = (Button) findViewById(R.id.button_minus);
        button_clear = (Button) findViewById(R.id.button_clear);

        Number1 = (EditText) findViewById(R.id.Number1);
        Number2 = (EditText) findViewById(R.id.Number2);

        output = (TextView) findViewById(R.id.output);


        String num1 = Number1.getText().toString();
        String num2 = Number2.getText().toString();


        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Number1.getText().toString().length()==0)
                    Toast.makeText(getApplicationContext(), "Enter Number1", Toast.LENGTH_SHORT).show();
                if(Number2.getText().toString().length()==0)
                    Toast.makeText(getApplicationContext(), "Enter Number2", Toast.LENGTH_SHORT).show();
                else {
                    display_mul();
                }
            }

            private void display_mul() {
                int number1 = Integer.parseInt(Number1.getText().toString());
                int number2 = Integer.parseInt(Number2.getText().toString());
                int mul = number1 * number2;
                output.setText(String.valueOf(mul));

            }
        });


        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Number1.getText().toString().length()==0)
                    Toast.makeText(getApplicationContext(), "Enter Number1", Toast.LENGTH_SHORT).show();
                if(Number2.getText().toString().length()==0)
                    Toast.makeText(getApplicationContext(), "Enter Number2", Toast.LENGTH_SHORT).show();
                else {
                    display_div();
                }

            }

            private void display_div() {
                int number1 = Integer.parseInt(Number1.getText().toString());
                int number2 = Integer.parseInt(Number2.getText().toString());
                if(Integer.parseInt(Number2.getText().toString())==0)
                    Toast.makeText(getApplicationContext(),"div by 0 is not possible", Toast.LENGTH_SHORT).show();
               else {
                    Double mul = (Double.valueOf(number1 / number2));
                    output.setText(String.valueOf(mul));
                }
            }
        });


        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Number1.getText().toString().length()==0)
                    Toast.makeText(getApplicationContext(), "Enter Number1", Toast.LENGTH_SHORT).show();
                if(Number2.getText().toString().length()==0)
                    Toast.makeText(getApplicationContext(), "Enter Number2", Toast.LENGTH_SHORT).show();
                else {
                    display_minus();
                }

            }

            private void display_minus() {
                int number1 = Integer.parseInt(Number1.getText().toString());
                int number2 = Integer.parseInt(Number2.getText().toString());
                int mul = number1 - number2;
                output.setText(String.valueOf(mul));

            }
        });


        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Number1.getText().toString().length()==0)
                    Toast.makeText(getApplicationContext(), "Enter Number1", Toast.LENGTH_SHORT).show();
                if(Number2.getText().toString().length()==0)
                    Toast.makeText(getApplicationContext(), "Enter Number2", Toast.LENGTH_SHORT).show();
                else {
                    display_plus();
                }

            }

            private void display_plus() {
                int number1 = Integer.parseInt(Number1.getText().toString());
                int number2 = Integer.parseInt(Number2.getText().toString());
                int mul = number1 + number2;
                output.setText(String.valueOf(mul));

            }
        });


        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("");
            }
        });

    }
}