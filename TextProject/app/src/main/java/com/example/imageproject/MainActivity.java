package com.example.imageproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickMe(View view){
        EditText name = (EditText) findViewById(R.id.editText1);
        EditText pass = (EditText) findViewById(R.id.editText2);

        Log.i("Username", name.getText().toString());
//        Log.i("check name", "it work");
        Log.i("Password",pass.getText().toString());
        Toast.makeText(this,"Hi "+ name.getText().toString(),Toast.LENGTH_LONG).show();
    }
}
