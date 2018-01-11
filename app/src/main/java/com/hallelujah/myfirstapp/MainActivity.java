package com.hallelujah.myfirstapp;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private final Long
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LEFTBUTTONPRESS(View view) {
        Button Button_roll = (Button) findViewById(R.id.roll_button);
        //Button_roll.setText(R.string.pressedButton);
        Log.i(TAG, "We pressed the button!");
        Random rand = new Random();
        int x = rand.nextInt(7);
        int turnscore=0;
        turnscore++;
        ImageView Image = (ImageView) findViewById(R.id.pic);
        if(x==1) {
            turnscore=0;
            Image.setImageResource(R.drawable.dice1);
        }
        if(x==2){
            turnscore=2;
            Image.setImageResource(R.drawable.dice2);
        }
        if(x==3){
            turnscore=3;
            Image.setImageResource(R.drawable.dice3);
        }
        if(x==4){
            turnscore=4;
            Image.setImageResource(R.drawable.dice4);
        }
        if(x==5){
            turnscore=5;
            Image.setImageResource(R.drawable.dice5);
        }

        if(x==6){
            turnscore=6;
            Image.setImageResource(R.drawable.dice6);
        }

        //Step 1: Get a random number from 1-6
        //Step 2: Show image that corresponds to random number
        //if(randomnumber is 1)
          //  then score is 0
        //Step 3: Update score
        //  If 1, turn score = 0 else turnscore += ranDice
        //Step 4:  Update label

        TextView Hello = (TextView) findViewById(R.id.ScoreKeep);

        Hello.setText("Your score:0"+" "+"Copmuter Score:0"+" "+"Your turn score:"+turnscore);

    }

    private void showRandomInteger(Random rand) {
    }

    public void MIDDLEBUTTONPRESS(View view){

        Button Button_hold = (Button) findViewById(R.id.hold_button);

        Random rand = new Random();
        int x = rand.nextInt(7);
        int turnscore=0;
        int overallscore=0;
        overallscore=turnscore+overallscore;

        Log.i(TAG,"We pressed the button!");

        TextView Hello = (TextView) findViewById(R.id.ScoreKeep);
        Hello.setText("Your score:"+overallscore+" "+"Copmuter Score:0");
    }
    public void RIGHTBUTTONPRESS(View view){
        Button Button_reset = (Button) findViewById(R.id.reset_button);
        Log.i(TAG,"We pressed the button!");
        TextView Hello = (TextView) findViewById(R.id.ScoreKeep);
        Hello.setText("Your score:0"+" "+"Copmuter Score:0");
    }
}
//LAST STEP, add timer for computer's turn . can also use a string with %d in place of string