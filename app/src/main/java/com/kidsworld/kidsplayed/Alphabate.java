package com.kidsworld.kidsplayed;

import android.app.Activity;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Alphabate extends Activity {
    public String [] mAlphaArray = {"A", "B", "C", "D", "E", "F", "G", "H","I","J"};
    ImageView next;
    ImageView previous;
    TextView text;
    TextView mainAlphabhet;
    int newcounter=9;
    public int mIfCounter = 0;

    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabate);


        next=(ImageView) findViewById(R.id.next);
        previous=(ImageView)findViewById(R.id.previous);
        mainAlphabhet=(TextView) findViewById(R.id.mainAlphabhet);
        text =(TextView) findViewById(R.id.text);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"font/arbill.ttf");
        mainAlphabhet.setTypeface(typeface);


        next.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                if (mIfCounter < mAlphaArray.length-1){
                    mIfCounter++;
                } else {
                    mIfCounter = 0;
                }
                mainAlphabhet.setText(mAlphaArray[mIfCounter]);
                nextTrack(mIfCounter);
            }
        });



        previous.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //text.setText(mIfCounter);
                if (mIfCounter > 0) {
                    mIfCounter--;
                } else {
                    mIfCounter = mAlphaArray.length-1;
                }
                nextTrack(mIfCounter);
                mainAlphabhet.setText(mAlphaArray[mIfCounter]);
                text.setText(""+mIfCounter);
            }
        });

    }
   public void nextTrack(int i)
    {
        if (mMediaPlayer != null) {
            mMediaPlayer.release(); // release any previously played / held resources
        }
        mMediaPlayer = new MediaPlayer();
        int []sounds={R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,R.raw.i,R.raw.j};
        mMediaPlayer = MediaPlayer.create(this, sounds[i]);
        mMediaPlayer.start();


    }
}
