package com.pspr.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText operand1,operand2,operator;
    Button calculate;
    TextView result;
    double op1;
    double op2;

    String op;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1 = findViewById(R.id.op1);
        operand2 = findViewById(R.id.op2);
        operator = findViewById(R.id.op);
        calculate = findViewById(R.id.calci);
        result = findViewById(R.id.result);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc();
            }
        });

    }

    public void calc(){
        op1 = Double.parseDouble("0"+operand1.getText().toString());
        op2 = Double.parseDouble("0"+operand2.getText().toString());
        op = operator.getText().toString();
        if(op.equals("+")){

        }
        else if(op.equals("-")){
            result.setText(""+(op1-op2));
        }
        else if(op.equals("*")){
            result.setText(""+(op1*op2));
        }
        else if(op.equals("/")){
            if(op2 != 0){
                result.setText(""+(op1/op2));
            }
            else{
                Toast.makeText(this, "Cannot be divided by 0", Toast.LENGTH_SHORT).show();
            }
        }
        else if(op.equals("^")){
            result.setText(""+(Math.pow(op1,op2)));
        }
        else{
            Toast.makeText(this, "Enter the right Operator", Toast.LENGTH_SHORT).show();
        }

    }

}