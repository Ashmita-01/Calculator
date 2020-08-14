package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    Button buttonNumber0;
    Button buttonNumber1;
    Button buttonNumber2;
    Button buttonNumber3;
    Button buttonNumber4;
    Button buttonNumber5;
    Button buttonNumber6;
    Button buttonNumber7;
    Button buttonNumber8;
    Button buttonNumber9;

    Button buttonClear;
    Button buttonPercent;
    Button buttonDivision;
    Button buttonMultiplication;
    Button buttonSubtraction;
    Button buttonAddition;
    Button buttonEqual;
    Button buttonDot;
    String op;
    String no1;

    TextView textViewInputNumbers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);

        buttonNumber0 = (Button) findViewById(R.id.btn_zero);
        buttonNumber1 = (Button) findViewById(R.id.btn_one);
        buttonNumber2 = (Button) findViewById(R.id.btn_two);
        buttonNumber3 = (Button) findViewById(R.id.btn_three);
        buttonNumber4 = (Button) findViewById(R.id.btn_four);
        buttonNumber5 = (Button) findViewById(R.id.btn_five);
        buttonNumber6 = (Button) findViewById(R.id.btn_six);
        buttonNumber7 = (Button) findViewById(R.id.btn_seven);
        buttonNumber8 = (Button) findViewById(R.id.btn_eight);
        buttonNumber9 = (Button) findViewById(R.id.btn_nine);

        buttonClear = (Button) findViewById(R.id.btn_allclear);
       // buttonPercent = (Button) findViewById(R.id.btn_percent);
        buttonDivision = (Button) findViewById(R.id.btn_divi);
        buttonMultiplication = (Button) findViewById(R.id.btn_mult);
        buttonSubtraction = (Button) findViewById(R.id.btn_sub);
        buttonAddition = (Button) findViewById(R.id.btn_add);
        buttonEqual = (Button) findViewById(R.id.btn_equal);
        buttonDot = (Button) findViewById(R.id.btn_dot);
        textViewInputNumbers = (TextView) findViewById(R.id.calc_screen);


        buttonNumber0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText()+"0");

            }
        });

        buttonNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText()+"1");

            }
        });

        buttonNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText()+"2");
            }
        });

        buttonNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText()+"3");
            }
        });

        buttonNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText()+"4");
            }
        });

        buttonNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText()+"5");
            }
        });

        buttonNumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText()+"6");
            }
        });

        buttonNumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText()+"7");
            }
        });

        buttonNumber8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText()+"8");
            }
        });

        buttonNumber9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText()+"9");
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText("");
            }
        });


        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                op="%";
                no1=textViewInputNumbers.getText()+"";
                textViewInputNumbers.setText("");

            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op="/";
                no1=textViewInputNumbers.getText()+"";
                textViewInputNumbers.setText("");
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op="*";
                no1=textViewInputNumbers.getText()+"";
                textViewInputNumbers.setText("");
            }
        });

        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op="-";
                no1=textViewInputNumbers.getText()+"";
                textViewInputNumbers.setText("");
            }
        });

        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op="+";
                no1=textViewInputNumbers.getText()+"";
                textViewInputNumbers.setText("");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int no2 = Integer.parseInt(textViewInputNumbers.getText()+"");

                if(op.equals("+"))
                {
                    int ans=Integer.parseInt(no1)+no2;
                    textViewInputNumbers.setText(ans+"");
                }
                else if(op.equals("-"))
                {
                    int ans=Integer.parseInt(no1)-no2;
                    textViewInputNumbers.setText(ans+"");

                }
                else if(op.equals("*"))
                {
                    //e1.setText(Integer.parseInt(no1)+ no2);
                    int ans=Integer.parseInt(no1)*no2;
                    textViewInputNumbers.setText(ans+"");

                }
                else if(op.equals("/"))
                {
                    //e1.setText(Integer.parseInt(no1)+ no2);
                    int ans=Integer.parseInt(no1)/no2;
                    textViewInputNumbers.setText(ans+"");

                }


            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewInputNumbers.setText(textViewInputNumbers.getText()+".1");

            }
        });




    }


}
