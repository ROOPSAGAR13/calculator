package com.example.roopsagar.calculatation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText fnum;
    EditText snum;
    EditText result;
    Button add;
    Button Sub;
    Button mul;
    Button div;


    double num1,num2,sum,subtract,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fnum=(EditText)findViewById(R.id.editText);
        snum=(EditText)findViewById(R.id.editText2);
        result=(EditText) findViewById(R.id.editText3);
        add=(Button) findViewById(R.id.button);
        Sub=(Button) findViewById(R.id.button2);
        mul=(Button) findViewById(R.id.button3);
        div=(Button) findViewById(R.id.button4);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(fnum.getText().toString());
                num2=Double.parseDouble(snum.getText().toString());
                sum=num1+num2;
                result.setText(Double.toString(sum));

            }
        }


        );
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(fnum.getText().toString());
                num2=Double.parseDouble(snum.getText().toString());
                subtract=num1-num2;
                result.setText(Double.toString(subtract));

            }
        }
        );

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(fnum.getText().toString());
                num2 = Double.parseDouble(snum.getText().toString());
                multiply = num1 * num2;
                result.setText(Double.toString(multiply));
            }
        }
        );
        div.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       num1=Double.parseDouble(fnum.getText().toString());
                                       num2=Double.parseDouble(snum.getText().toString());
                                       divide=num1/num2;
                                       result.setText(Double.toString(divide));

                                   }
                               }
        );


} }
