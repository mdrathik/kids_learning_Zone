package com.kidsworld.kidsplayed;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Boolean.TRUE;


public class MainActivity extends Activity {
    public String [] mAlphaArray = {"A", "B", "C", "D", "E", "F", "G", "H"};

    MediaPlayer mMediaPlayer;
    // a counter to track the position - might not be required
    public int mIfCounter = 0;
    // the label to show the array element
    public TextView mViewLabel;
    TextView sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mMediaPlayer = new MediaPlayer();
        mMediaPlayer = MediaPlayer.create(this, R.raw.cuppy);
        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mMediaPlayer.setLooping(true);
        mMediaPlayer.start();
    }
     public void alphabate(View view){
         Intent intent= new Intent(this, Alphabate.class);
         startActivity(intent);
     }

    @Override
    protected void onResume() {
        mMediaPlayer.start();
        super.onResume();
    }
    @Override
    protected void onPause() {
        mMediaPlayer.pause();
        super.onPause();
    }
    protected void onRestart() {
        mMediaPlayer.start();
        super.onRestart();


    }
      /* public void nextTrack(int i)
    {
        mMediaPlayer = new MediaPlayer();
        int []sounds={R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,R.raw.i,R.raw.j};
        mMediaPlayer = MediaPlayer.create(this, sounds[i]);
        mMediaPlayer.start();
    }*/
}
