package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean yellow_turn = true;
    public void play(View view){
        ImageView chip = (ImageView) view;
        if(yellow_turn){
        chip.setImageResource(R.drawable.yellowchip);
        yellow_turn =false;}
        else{
            chip.setImageResource(R.drawable.redchip);
            yellow_turn =true;
        }
        chip.animate().rotation(360).setDuration(1000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
