package com.hallelujah.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void LEFTBUTTONPRESS(View view) {
        Button Button_roll = (Button) findViewById(R.id.roll_button);
        //Button_roll.setText(R.string.pressedButton);
        Log.i(TAG, "We pressed the button!");
        if (Button_roll.isPressed()){
            Button_roll.getResources().getDrawable(R.drawable.dice3);

        }
    }


    public void MIDDLEBUTTONPRESS(View view){
        Button Button_hold = (Button) findViewById(R.id.hold_button);
        //Button_hold.setText(R.string.pressedButton);
        Log.i(TAG,"We pressed the button!");
    }
    public void RIGHTBUTTONPRESS(View view){
        Button Button_reset = (Button) findViewById(R.id.reset_button);
        Log.i(TAG,"We pressed the button!");
    }
}
