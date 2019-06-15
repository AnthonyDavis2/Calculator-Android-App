package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private Button equal;
    private Button clear;
    private EditText display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectingUI();

        //adding numbers from buttons to display
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+'0');
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+'1');
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+'2');
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+'3');
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+'4');
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+'5');
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+'6');
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+'7');
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+'8');
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+'9');
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+'+');
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+'-');
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+'*');
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+'/');
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                solve();
            }
        });

    }


    //solving the equation and calling the function based off what operation it is
    private void solve() {
        int count = 0;

        String equ = display.getText().toString();
        int len = equ.length();
        for(int i = 0; i < len; i++) {
            char ch = equ.charAt(i);
            if(ch == '+') {
                computeAdd(count, len);
                break;
            }
            else if(ch == '-') {
                computeSub(count, len);
                break;
            }
            else if(ch == '*') {
                computeMulti(count, len);
                break;
            }
            else if(ch == '/') {
                computeDiv(count, len);
                break;
            }
            count++;
        }
    }

    private void computeAdd(int x, int y){
        String equ = display.getText().toString();
        String one="";
        String two="";
        int first;
        int second;
        for(int i = 0; i < y; i++) {
            char ch = equ.charAt(i);
            if(i<x) {
                one = one + String.valueOf(ch);
            }
            else if(i>x) {
                two = two + String.valueOf(ch);
            }

        }
        first = Integer.parseInt(one);
        second = Integer.parseInt(two);
        double ans = first+second;
        String finalAns = Double.toString(ans);

        display.setText(finalAns);

    }

    private void computeSub(int x, int y){
        String equ = display.getText().toString();
        String one="";
        String two="";
        int first;
        int second;
        for(int i = 0; i < y; i++) {
            char ch = equ.charAt(i);
            if(i<x) {
                one = one + String.valueOf(ch);
            }
            else if(i>x) {
                two = two + String.valueOf(ch);
            }

        }
        first = Integer.parseInt(one);
        second = Integer.parseInt(two);
        double ans = first-second;
        String finalAns = Double.toString(ans);

        display.setText(finalAns);

    }

    private void computeMulti(int x, int y){
        String equ = display.getText().toString();
        String one="";
        String two="";
        int first;
        int second;
        for(int i = 0; i < y; i++) {
            char ch = equ.charAt(i);
            if(i<x) {
                one = one + String.valueOf(ch);
            }
            else if(i>x) {
                two = two + String.valueOf(ch);
            }

        }
        first = Integer.parseInt(one);
        second = Integer.parseInt(two);
        double ans = first*second;
        String finalAns = Double.toString(ans);

        display.setText(finalAns);

    }

    private void computeDiv(int x, int y){
        String equ = display.getText().toString();
        String one="";
        String two="";
        int first;
        int second;
        for(int i = 0; i < y; i++) {
            char ch = equ.charAt(i);
            if(i<x) {
                one = one + String.valueOf(ch);
            }
            else if(i>x) {
                two = two + String.valueOf(ch);
            }

        }
        first = Integer.parseInt(one);
        second = Integer.parseInt(two);
        double ans = first/second;
        String finalAns = Double.toString(ans);

        display.setText(finalAns);

    }

    private void connectingUI() {
        //matching number buttons
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);

        //matching operations
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        equal = findViewById(R.id.equal);
        clear = findViewById(R.id.clear);

        //matching display
        display = findViewById(R.id.display);

    }
    }
