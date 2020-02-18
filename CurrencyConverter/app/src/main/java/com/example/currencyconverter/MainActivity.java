package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button(View view){
        EditText dollar  = (EditText) findViewById(R.id.currency);
        double Euro = parseDouble( dollar.getText().toString())*0.92;
//        Log.i("Euro",Double.toString(Euro));

        Toast.makeText(this, String.format("%.2f",Euro)+"Euro", Toast.LENGTH_LONG).show();
    }
}
