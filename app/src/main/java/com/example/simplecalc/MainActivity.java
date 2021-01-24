package com.example.simplecalc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttondivision,
            buttonMul, button10, buttonC, buttonEqual,buttonmod;
    EditText edittext;

    float mValueOne, mValueTwo;

    boolean addition, mSubtract, multiplication, division,modulo;
    boolean val=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonsub);
        buttonMul = findViewById(R.id.buttonmul);
        buttondivision = findViewById(R.id.buttondiv);
        buttonC = findViewById(R.id.buttonC);
        buttonEqual = findViewById(R.id.buttoneql);
        buttonmod = findViewById(R.id.buttonmod);
        edittext = findViewById(R.id.edt1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val){
                    edittext.setText("");
                    val=false;
                }
                edittext.setText(edittext.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val){
                    edittext.setText("");
                    val=false;
                }
                //edittext.setText("");
                edittext.setText(edittext.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val){
                    edittext.setText("");
                    val=false;
                }
                //edittext.setText("");
                edittext.setText(edittext.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val){
                    edittext.setText("");
                    val=false;
                }
                //edittext.setText("");
                edittext.setText(edittext.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val){
                    edittext.setText("");
                    val=false;
                }
               // edittext.setText("");
                edittext.setText(edittext.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val){
                    edittext.setText("");
                    val=false;
                }
                //edittext.setText("");
                edittext.setText(edittext.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val){
                    edittext.setText("");
                    val=false;
                }
                //edittext.setText("");
                edittext.setText(edittext.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val){
                    edittext.setText("");
                    val=false;
                }
                //edittext.setText("");
                edittext.setText(edittext.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val){
                    edittext.setText("");
                    val=false;
                }
               // edittext.setText("");
                edittext.setText(edittext.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val){
                    edittext.setText("");
                    val=false;
                }
                //edittext.setText("");
                edittext.setText(edittext.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edittext == null) {
                   // Toast.makeText(getApplicationContext(),"Enter a number first",Toast.LENGTH_LONG).show();
                    edittext.setText("");
                } else {
                    mValueOne = Float.parseFloat(edittext.getText() + "");
                    addition = true;
                    edittext.setText("");
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edittext.getText() + "");
                mSubtract = true;
                edittext.setText("");
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edittext.getText() + "");
                multiplication = true;
                edittext.setText("");
            }
        });

        buttondivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edittext.getText() + "");
                division = true;
                edittext.setText("");
            }
        });
        buttonmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edittext.getText() + "");
                modulo = true;
                edittext.setText("");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edittext.getText() + "");

                if (addition == true) {
                    edittext.setText(mValueOne + mValueTwo + "");
                   mValueOne=0;
                    mValueTwo=0;
                    val=true;
                    addition = false;
                }

                if (mSubtract == true) {
                    edittext.setText(mValueOne - mValueTwo + "");
                    mValueOne=0;
                    mValueTwo=0;
                    val=true;
                    mSubtract = false;
                }

                if (multiplication == true) {
                    edittext.setText(mValueOne * mValueTwo + "");
                    mValueOne=0;
                    mValueTwo=0;
                    multiplication = false;
                    val=true;
                }

                if (division == true) {
                    edittext.setText(mValueOne / mValueTwo + "");
                    mValueOne=0;
                    mValueTwo=0;
                    division = false;
                    val=true;
                }

                if (modulo == true) {
                    edittext.setText(mValueOne % mValueTwo + "");
                    mValueOne=0;
                    mValueTwo=0;
                    modulo = false;
                    val=true;
                }
            }

        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + ".");
            }
        });
    }
}