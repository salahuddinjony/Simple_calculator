package com.example.lab4homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //create object

    Button buttonAdd,buttonSub,buttonMul,buttonDiv,buttonPer,buttonAc;
    EditText editTextN1,editTextN2;
    TextView textView;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd=findViewById(R.id.btn_add);
        buttonSub=findViewById(R.id.btn_sub);
        buttonMul=findViewById(R.id.btn_mul);
        buttonDiv=findViewById(R.id.btn_div);
        buttonPer=findViewById(R.id.btn_per);
        buttonAc=findViewById(R.id.btn_ac);

        editTextN1=findViewById(R.id.number1);
        editTextN2=findViewById(R.id.number2);

        textView=findViewById(R.id.answer);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonPer.setOnClickListener(this);
        buttonAc.setOnClickListener(this);
    }

    //Function for input that's means edittext
    public int getIntFromEditText(EditText editText){
        if(editText.getText().toString().equals("")){
            Toast.makeText(this,"Enter number" ,Toast.LENGTH_SHORT).show();
            return 0;
        }else
            return Integer.parseInt(editText.getText().toString());
    }
    @Override
    public void onClick(View view) {
        num1 = getIntFromEditText(editTextN1);
        num2 = getIntFromEditText(editTextN2);

        if (view.getId() == R.id.btn_add) {
            textView.setText("Answer(Add) = " + (num1 + num2));
        } else if (view.getId() == R.id.btn_sub) {
            textView.setText("Answer(Sub) = " + (num1 - num2));
        } else if (view.getId() == R.id.btn_mul) {
            textView.setText("Answer(Mul) = " + (num1 * num2));
        } else if (view.getId() == R.id.btn_div) {
            if (num2 != 0) {
                textView.setText("Answer(Div) = " + ((double) num1 / num2));
            } else {
                Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
            }
        } else if (view.getId() == R.id.btn_per) {
            textView.setText("Answer(percentage just num1) = " + ((double)num1/100));
        }else if (view.getId() == R.id.btn_ac) {
            textView.setText(" ");
            editTextN1.setText("");
            editTextN2.setText("");



        }

    }

}