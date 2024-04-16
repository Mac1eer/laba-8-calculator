package com.example.laba8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String sign = "0";
    public Double tempDouble, tempDouble2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);

        Button buttonA = findViewById(R.id.buttonA);
        Button buttonS = findViewById(R.id.buttonS);
        Button buttonM = findViewById(R.id.buttonM);
        Button buttonD = findViewById(R.id.buttonD);

        Button buttonC = findViewById(R.id.buttonC);
        Button buttonE = findViewById(R.id.buttonE);
        Button buttonPoint = findViewById(R.id.buttonPoint);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView output = findViewById(R.id.outputText);
                output.append("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView output = findViewById(R.id.outputText);
                output.append("1");
            }
        }
        );
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView output = findViewById(R.id.outputText);
                output.append("2");
            }
        }
        );
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output = findViewById(R.id.outputText);
                        output.append("3");
                    }
                }
        );
        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output = findViewById(R.id.outputText);
                        output.append("4");
                    }
                }
        );
        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output = findViewById(R.id.outputText);
                        output.append("5");
                    }
                }
        );
        button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output = findViewById(R.id.outputText);
                        output.append("6");
                    }
                }
        );
        button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output =  findViewById(R.id.outputText);
                        output.append("7");
                    }
                }
        );
        button8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output = findViewById(R.id.outputText);
                        output.append("8");
                    }
                }
        );
        button9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output = findViewById(R.id.outputText);
                        output.append("9");
                    }
                }
        );
        buttonA.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        TextView output = findViewById(R.id.outputText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "+";
                    }
                }
        );
        buttonS.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        TextView output = findViewById(R.id.outputText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "-";
                    }
                }
        );
        buttonM.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output = findViewById(R.id.outputText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "*";
                    }
                }
        );
        buttonD.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output = findViewById(R.id.outputText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "/";
                    }
                }
        );
        buttonC.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output = findViewById(R.id.outputText);
                        output.setText("");
                    }
                }
        );
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView output = findViewById(R.id.outputText);
                output.append(".");
            }
        });
        buttonE.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output = findViewById(R.id.outputText);
                        tempDouble2 = Double.parseDouble(output.getText().toString());

                        if (sign == "+") {
                            output.setText(Double.toString(tempDouble + tempDouble2));
                        } else if (sign == "-") {
                            output.setText(Double.toString(tempDouble - tempDouble2));
                        } else if (sign == "*") {
                            output.setText(Double.toString(tempDouble * tempDouble2));
                        } else if (sign == "/") {
                            if (tempDouble2 == 0) {
                                output.setText("Cannot");
                            } else {
                                output.setText(Double.toString(tempDouble / tempDouble2));
                            }
                        }
                    }
                }
        );
    }
}
