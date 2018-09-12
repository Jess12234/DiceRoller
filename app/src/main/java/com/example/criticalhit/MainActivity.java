package com.example.criticalhit;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    private TextView critical;
    private TextView fail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        critical = findViewById(R.id.critical_hit);
        fail = findViewById(R.id.critical_miss);


        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer roll= MediaPlayer.create(MainActivity.this,R.raw.dicerollsounc);
                roll.start();
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;

        MediaPlayer miss = MediaPlayer.create(MainActivity.this,R.raw.failsound);
        MediaPlayer hit = MediaPlayer.create(MainActivity.this,R.raw.victorysound);

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                fail.setVisibility(View.VISIBLE);
                critical.setVisibility(View.INVISIBLE);
                hit.stop();
                miss.start();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.INVISIBLE);
                miss.stop();
                hit.stop();
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                fail.setVisibility(View.INVISIBLE);
                critical.setVisibility(View.VISIBLE);
                miss.stop();
                hit.start();
                break;
        }
    }
}