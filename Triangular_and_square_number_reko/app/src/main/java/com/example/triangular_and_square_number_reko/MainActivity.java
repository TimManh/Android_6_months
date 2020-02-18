package com.example.triangular_and_square_number_reko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public boolean isSquare(int num){
        boolean result = true;
        double temp = Math.sqrt(num);
        if(temp == Math.floor(temp)){
            ;
        }else{
            result = false;
        }
        return result;
    }
    public boolean isTri(int num){
        boolean result = true;
        int i =1;
        int j =1;
        while(i<num){
            j++;
            i+=j;
        }
        if(i== num){
            ;
        }else{
            result =false;
        }
        return  result;
    }
    public void checkValue(View view){
        EditText number = (EditText) findViewById(R.id.number);
        if (number.getText().toString().isEmpty()){
            Toast.makeText(this, "Fill in the number", Toast.LENGTH_LONG).show();
            return;
        }
        int value =Integer.parseInt(number.getText().toString());
        boolean checkSquare = isSquare(value);
        boolean checkTri = isTri(value);
        if(checkTri == true && checkSquare ==true){
            Toast.makeText(this, "This is a Triangular number & Square number", Toast.LENGTH_LONG).show();
        }else if(checkTri == true){
            Toast.makeText(this, "This is a Triangular number", Toast.LENGTH_LONG).show();
        }else if(checkSquare == true) {
            Toast.makeText(this, "This is a Square number", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "This is not a Square number or  Triangular number !!!", Toast.LENGTH_LONG).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

