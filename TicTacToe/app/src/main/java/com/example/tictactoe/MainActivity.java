package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String winner = "";
    int yellow_turn = 1;
    int [] gameState={2,2,2,2,2,2,2,2,2};
    int [][]winning = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    boolean finish = false;
    public void play(View view){
        ImageView chip = (ImageView) view;
        int tappedCount = Integer.parseInt( chip.getTag().toString());
        if(gameState[tappedCount]==2 && winner=="") {
            gameState[tappedCount] = yellow_turn;
            if (yellow_turn == 1) {
                chip.setImageResource(R.drawable.yellowchip);
                yellow_turn = 0;
            } else {
                chip.setImageResource(R.drawable.redchip);
                yellow_turn = 1;
            }
            chip.animate().rotation(360).setDuration(1000);
            for (int[] winning : winning) {
                if (gameState[winning[0]] == gameState[winning[1]] && gameState[winning[1]] == gameState[winning[2]] && gameState[winning[0]] != 2) {
                    if (yellow_turn == 0) {
                        winner = "Yellow";
                    } else {
                        winner = "Red";
                    }
                    Toast.makeText(this, winner + " has won!", Toast.LENGTH_SHORT).show();
                    Button button = (Button) findViewById(R.id.button);
                    TextView playAgain = (TextView) findViewById(R.id.playAgain);
                    button.setVisibility(View.VISIBLE);
                    playAgain.setVisibility(View.VISIBLE);
                }

            }
        }
    }

    public void restart(View view){
        Button button = (Button) findViewById(R.id.button);
        TextView playAgain = (TextView) findViewById(R.id.playAgain);
        button.setVisibility(View.INVISIBLE);
        playAgain.setVisibility(View.INVISIBLE);
        GridLayout gridLayout = findViewById(R.id.gridLayout);
        for(int i=0; i<gridLayout.getChildCount();i++){
            ImageView chip = (ImageView) gridLayout.getChildAt(i);
            chip.setImageDrawable(null);
        }
        for(int i =0; i<gameState.length;i++){
            gameState[i] = 2;
        }
        winner ="";
//        yellow_turn =1;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
