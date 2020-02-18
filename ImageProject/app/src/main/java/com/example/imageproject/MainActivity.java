package com.example.imageproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeDiffCat(View view){
        ImageView cat1 = (ImageView) findViewById(R.id.cat1_2);
        cat1.setImageResource(R.drawable.cat2);

    }
}
