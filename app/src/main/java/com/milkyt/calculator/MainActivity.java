package com.milkyt.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7,
            button_8, button_9, button_C, button_brackets, button_percent, button_division, button_multiply,
            button_minus, button_plus, button_equal, button_dot, button_module;

    EditText edit_text;
    float value_1, value_2;
    boolean boolean_plus, boolean_minus, boolean_multiply, boolean_division, boolean_percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_0 = (Button) findViewById(R.id.button_0);
        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);
        button_5 = (Button) findViewById(R.id.button_5);
        button_6 = (Button) findViewById(R.id.button_6);
        button_7 = (Button) findViewById(R.id.button_7);
        button_8 = (Button) findViewById(R.id.button_8);
        button_9 = (Button) findViewById(R.id.button_9);
        button_C = (Button) findViewById(R.id.button_C);
        button_brackets = (Button) findViewById(R.id.button_brackets);
        button_percent = (Button) findViewById(R.id.button_percent);
        button_division = (Button) findViewById(R.id.button_division);
        button_multiply = (Button) findViewById(R.id.button_multiply);
        button_minus = (Button) findViewById(R.id.button_minus);
        button_plus = (Button) findViewById(R.id.button_plus);
        button_equal = (Button) findViewById(R.id.button_equal);
        button_dot = (Button) findViewById(R.id.button_dot);
        button_module = (Button) findViewById(R.id.button_module);
        edit_text = (EditText) findViewById(R.id.edit_text_show_digits);

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_text.setText(edit_text.getText() + "0");
            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_text.setText(edit_text.getText() + "1");
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_text.setText(edit_text.getText() + "2");
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_text.setText(edit_text.getText() + "3");
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_text.setText(edit_text.getText() + "4");
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_text.setText(edit_text.getText() + "5");
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_text.setText(edit_text.getText() + "6");
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_text.setText(edit_text.getText() + "7");
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_text.setText(edit_text.getText() + "8");
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_text.setText(edit_text.getText() + "9");
            }
        });
        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_text.setText(edit_text.getText() + ".");
            }
        });
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit_text == null) {
                    edit_text.setText("");
                } else {
                    value_1 = Float.parseFloat(edit_text.getText() + "");
                    boolean_plus = true;
                    edit_text.setText(null);
                }
            }
        });
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit_text == null) {
                    edit_text.setText("");
                } else {
                    value_1 = Float.parseFloat(edit_text.getText() + "");
                    boolean_minus = true;
                    edit_text.setText(null);
                }
            }
        });
        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit_text == null) {
                    edit_text.setText("");
                } else {
                    value_1 = Float.parseFloat(edit_text.getText() + "");
                    boolean_multiply = true;
                    edit_text.setText(null);
                }
            }
        });
        button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit_text == null) {
                    edit_text.setText("");
                } else {
                    value_1 = Float.parseFloat(edit_text.getText() + "");
                    boolean_division = true;
                    edit_text.setText(null);
                }
            }
        });
        button_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit_text == null) {
                    edit_text.setText("");
                } else {
                    value_1 = Float.parseFloat(edit_text.getText() + "");
                    boolean_percent = true;
                    edit_text.setText(null);
                }
            }
        });
        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_2 = Float.parseFloat(edit_text.getText() + "");
                if (boolean_plus == true) {
                    edit_text.setText(value_1 + value_2 + "");
                    boolean_plus = false;
                }
                if (boolean_minus == true) {
                    edit_text.setText(value_1 - value_2 + "");
                    boolean_minus = false;
                }
                if (boolean_multiply == true) {
                    edit_text.setText(value_1 * value_2 + "");
                    boolean_multiply = false;
                }
                if (boolean_division == true) {
                    edit_text.setText(value_1 / value_2 + "");
                    boolean_division = false;
                }
                if (boolean_percent == true) {
                    edit_text.setText((value_1 * value_2) / 100 + "");
                    boolean_percent = false;
                }
            }
        });
        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_text.setText("");
            }
        });
    }
}