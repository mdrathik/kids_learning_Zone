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
    public String [] mAlphaArray = {"A", "B", "C", "D", "E", "F", "G", "H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    public String [] mfor={"A for APPLE","B For BEE","C for CAT","D For DOOR","E for EGG","F for FISH","G for Glass","H for HAND","I for ICE-CREAM","J for JUICE","K for KEY","L for LION","M for MANGO","N for NEST","O for ORANGE","P for PAPAYA",
            "Q for QUEEN","R For RABBIT","S for STOBERRY","T for TREE","U for UMBRELLA","V for VEGETABLES","W for WATER","X for xylophone","Y for YELLOW","Z for ZEBRA"};

    public  int[]ImageSource={R.drawable.apple,R.drawable.bee,R.drawable.cat,R.drawable.door,R.drawable.egg,R.drawable.fish,R.drawable.glss,R.drawable.hand,R.drawable.ice,R.drawable.juice,R.drawable.key,R.drawable.light,R.drawable.mngo,R.drawable.nest,R.drawable.ornge,R.drawable.papaya,R.drawable.qun,R.drawable.rab,R.drawable.stbry,R.drawable.tree,R.drawable.umbrella,R.drawable.vgtbles,R.drawable.water,R.drawable.xl,R.drawable.y,R.drawable.z};


    ImageView next;
    ImageView mainImage;
    ImageView previous;
    TextView text;
    TextView mainAlphabhet;
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

        mainImage=(ImageView)findViewById(R.id.mainicon);


        next.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                mainAlphabhet.setText(mAlphaArray[mIfCounter]);
                text.setText(mfor[mIfCounter]);
                mainImage.setImageResource(ImageSource[mIfCounter]);
                nextTrack(mIfCounter);
                if (mIfCounter < mAlphaArray.length-1){
                    mIfCounter++;
                } else {
                    mIfCounter = 0;
                }

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
                mainAlphabhet.setText(mAlphaArray[mIfCounter]);
                text.setText(mfor[mIfCounter]);
                mainImage.setImageResource(ImageSource[mIfCounter]);
                nextTrack(mIfCounter);
            }
        });

    }
    public void nextTrack(int i)
    {
        if (mMediaPlayer != null) {
            mMediaPlayer.release(); // release any previously played / held resources
        }
        mMediaPlayer = new MediaPlayer();
        int []sounds={R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,R.raw.i,R.raw.j,R.raw.k,R.raw.l,R.raw.m,R.raw.n,R.raw.o,R.raw.p,R.raw.q,R.raw.r,R.raw.s,R.raw.t,R.raw.u,R.raw.v,R.raw.w,R.raw.x,R.raw.y,R.raw.z};
        mMediaPlayer = MediaPlayer.create(this, sounds[i]);
        mMediaPlayer.start();


    }
}
