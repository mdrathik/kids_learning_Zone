package com.kidsworld.kidsplayed;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.kidsworld.kidsplayed.Drawing.Drawing;
import com.kidsworld.kidsplayed.OneTextOneImage.SwipOnetextOneImage;
import com.kidsworld.kidsplayed.OnlyAlphabhet.Alphabate;
import com.kidsworld.kidsplayed.TwoTextOneImage.SwipTwoTextOneImg;


public class MainActivity extends Activity {


    MediaPlayer mMediaPlayer;
    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMediaPlayer = new MediaPlayer();
        mMediaPlayer = MediaPlayer.create(this, R.raw.main);
        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mMediaPlayer.setLooping(true);
        mMediaPlayer.start();




        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }
     public void alphabate(View view){
         String main_title="Alphabet";
         int []sounds={R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,R.raw.i,R.raw.j,R.raw.k,R.raw.l,R.raw.m,R.raw.n,R.raw.o,R.raw.p,R.raw.q,R.raw.r,R.raw.s,R.raw.t,R.raw.u,R.raw.v,R.raw.w,R.raw.x,R.raw.y,R.raw.z};
         String[]capital={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
         String[]small={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

         Intent intent= new Intent(this, Alphabate.class);
         intent.putExtra("alphabet",main_title);
         intent.putExtra("sounds",sounds);
         intent.putExtra("capital",capital);
         intent.putExtra("small",small);
         startActivity(intent);
     }



     public void alphaWithName(View view){
         String main_title="Alphabet with Words";
         int st=R.raw.apple;
         int []sounds={R.raw.apple,R.raw.burger,R.raw.cake,R.raw.duck,R.raw.elephant,R.raw.foods,R.raw.graph,R.raw.hummingbird,R.raw.icecream,R.raw.jug,R.raw.kiwi,R.raw.lemon,R.raw.mango,R.raw.nest,R.raw.orange,R.raw.parrot,R.raw.queen,R.raw.rice,R.raw.strawberry,R.raw.tree,R.raw.umbrella,R.raw.ven,R.raw.watermelon,R.raw.xray,R.raw.yoyo,R.raw.zebra};
         String[]Nickname={"Apple","Burger","Cake","Duck","Elephant","Foods","Grape","Humming Bird","Ice-Cream","Jug","Kiwi","Lemon","Mango","Nest","Orange","Parrot","Queen","Rice","Strawberry","Tree","Umbrella","Vase","Watermelon","X-ray","Yo-Yo","Zebra"};
         String[]Alphabet={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
         int[]img={R.drawable.apple,R.drawable.burger,R.drawable.cake,R.drawable.duck,R.drawable.elephant,R.drawable.foods,R.drawable.graphe,R.drawable.hummingbird,R.drawable.icecream,R.drawable.jug,R.drawable.kiwi,R.drawable.lemon,R.drawable.mango,R.drawable.nest,R.drawable.orange,R.drawable.parrot,R.drawable.queen,R.drawable.rice,R.drawable.strawberry,R.drawable.tree,R.drawable.umbrella,R.drawable.vase,R.drawable.watermelon,R.drawable.xray,R.drawable.yoyo,R.drawable.cake};
         Intent intent=new Intent(this, SwipTwoTextOneImg.class);
         intent.putExtra("alphabet",main_title);
         intent.putExtra("Nickname",Nickname);
         intent.putExtra("Alphabet",Alphabet);
         intent.putExtra("sounds",sounds);
         intent.putExtra("img",img);
         intent.putExtra("st",st);
         startActivity(intent);
     }

    public void counting(View view){
        int st=R.raw.one;
        String main_title="Number Counting";
        int []sounds={R.raw.one,R.raw.two,R.raw.three,R.raw.four,R.raw.five,R.raw.six,R.raw.seven,R.raw.eight,R.raw.nine,R.raw.ten};
        String[]Nickname={"1","2","3","4","5","6","7","8","9","10"};
        String[]Alphabet={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        int[]img={R.drawable.apple,R.drawable.bread,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten};
        Intent intent=new Intent(this, SwipTwoTextOneImg.class);
        intent.putExtra("alphabet",main_title);
        intent.putExtra("Nickname",Nickname);
        intent.putExtra("Alphabet",Alphabet);
        intent.putExtra("sounds",sounds);
        intent.putExtra("img",img);
        intent.putExtra("st",st);
        startActivity(intent);
    }

     public  void fruits(View view){
         int st=R.raw.avacadofrt;
         int []sounds={R.raw.avacadofrt,R.raw.banannafrt,R.raw.bluebrryf,R.raw.carambolafrt,R.raw.chryfrt,R.raw.dtfrt,R.raw.gwva,R.raw.jackfrtfrt,R.raw.ppyafrt,R.raw.pineapplefrt,R.raw.peynutfrt};

         String main_title="Fruits";
         String[]text={"Avocado","Banana","Blue Berries","Carambola","Cherry","Date Fruit's","Guava","Jackfruits","Papaya","Peanut","Pineapple"};
         int[]img={R.drawable.avocado,R.drawable.bananax,R.drawable.blueberries,R.drawable.carambola,R.drawable.cherry,R.drawable.datefruits,R.drawable.guava,R.drawable.jackfruits,R.drawable.papaya,R.drawable.peanutsx,R.drawable.pineapple};
         Intent intent= new Intent(this, SwipOnetextOneImage.class);
         intent.putExtra("text",text);
         intent.putExtra("alphabet",main_title);
         intent.putExtra("img",img);
         intent.putExtra("sounds",sounds);
        intent.putExtra("st",st);
         startActivity(intent);
     }
public void bird(View view){
    int st=R.raw.flamingobird;
    int []sounds={R.raw.flamingobird,R.raw.heronbrd,R.raw.hmmngbrd,R.raw.owlbrd,R.raw.parrotbrd,R.raw.peackbrd,R.raw.pigeonbrd,R.raw.songbrd,R.raw.sparrwbrd,R.raw.swanbrd};

    String main_title="Birds";
    String[]text={"Flamingo","Heron","Humming Bird","Owl","Parrot","PeaCock","Pigeon","Songbird","Sparrow","Swan"};
    int[]img={R.drawable.flamingo,R.drawable.heron,R.drawable.hummingbird,R.drawable.owl,R.drawable.parrot,R.drawable.peacock,R.drawable.pexels,R.drawable.songsbird,R.drawable.sparrow,R.drawable.swan};
    Intent intent= new Intent(this, SwipOnetextOneImage.class);
    intent.putExtra("alphabet",main_title);
    intent.putExtra("text",text);
    intent.putExtra("img",img);

    intent.putExtra("sounds",sounds);
    intent.putExtra("st",st);
    startActivity(intent);
}

public void foods(View view){
     int st=R.raw.breadfood;
     int []sounds={R.raw.breadfood,R.raw.burgerfood,R.raw.cakefood,R.raw.chocklatefood,R.raw.frenchfoods,R.raw.pastafood,R.raw.pizzafood,R.raw.ricefood,R.raw.sandwitch};

    String main_title="Foods";
    String[]text={"Bread","Burger","Cake","Chocolate","French fries","Pasta","Pizza","Rice","Sandwich"};
    int[]img={R.drawable.bread,R.drawable.burger,R.drawable.cake,R.drawable.chocolate,R.drawable.friencefries,R.drawable.pasta,R.drawable.pizza,R.drawable.rice,R.drawable.sandwitch};
    Intent intent= new Intent(this, SwipOnetextOneImage.class);
    intent.putExtra("alphabet",main_title);
    intent.putExtra("text",text);
    intent.putExtra("img",img);
    intent.putExtra("sounds",sounds);
     intent.putExtra("st",st);
    startActivity(intent);
}
    public void animal(View view){

        int st=R.raw.catanimal;
        int []sounds={R.raw.catanimal,R.raw.duckanimal,R.raw.elephantanimal,R.raw.leaopardanimal,R.raw.lionanimal,R.raw.pandaanimal,R.raw.penguinanimal,R.raw.tigeranimal,R.raw.wolfanimal,R.raw.zebraanimal};
        String main_title="Animals";
        String[]text={"Cat","Duck","Elephant","Leopard","Lion","Panda","Penguin","Tiger","Wolf","Zebra"};
        int[]img={R.drawable.cat,R.drawable.duck,R.drawable.elephant,R.drawable.leopard,R.drawable.lion,R.drawable.panda,R.drawable.penguin,R.drawable.tiger,R.drawable.wolf,R.drawable.zebra};
        Intent intent= new Intent(this, SwipOnetextOneImage.class);
        intent.putExtra("alphabet",main_title);
        intent.putExtra("text",text);
        intent.putExtra("img",img);

        intent.putExtra("sounds",sounds);
        intent.putExtra("st",st);

        startActivity(intent);
    }


    public  void vehi(View view){
        int st=R.raw.areoplnvehi;
        int []sounds={R.raw.areoplnvehi,R.raw.bycyclevehi,R.raw.busvehi,R.raw.carvehi,R.raw.helicoptorvehi,R.raw.motorvehi,R.raw.schootervehi,R.raw.shipvehi,R.raw.trainvehi};


        String main_title="Vehicles";
        String[]text={"Aeroplane","Bicycle","Bus","Car","Helicopter","Motorcycle","Scooter","Ship","Train"};
        int[]img={R.drawable.aeroplane,R.drawable.bicycle,R.drawable.bus,R.drawable.car,R.drawable.helicopter,R.drawable.motorcycle,R.drawable.sc,R.drawable.sh,R.drawable.train};
        Intent intent= new Intent(this, SwipOnetextOneImage.class);
        intent.putExtra("alphabet",main_title);
        intent.putExtra("text",text);
        intent.putExtra("img",img);

        intent.putExtra("sounds",sounds);
        intent.putExtra("st",st);

        startActivity(intent);
    }
    public void color(View view){
        int st=R.raw.blackc;
        int []sounds={R.raw.blackc,R.raw.blue,R.raw.brownc,R.raw.goldc,R.raw.greenc,R.raw.orangec,R.raw.pinkc,R.raw.purplec,R.raw.redc,R.raw.silverc,R.raw.whitec,R.raw.yellowc};

        String main_title="Colors";
        String[]text={"Black","Blue","Brown","Gold","Green","Orange","Pink","Purple","Red","Silver","White","Yellow"};
        int[]img={R.drawable.balck,R.drawable.blue,R.drawable.brown,R.drawable.gold,R.drawable.green,R.drawable.orangex,R.drawable.pink,R.drawable.purple,R.drawable.red,R.drawable.silver,R.drawable.white,R.drawable.yellow};
        Intent intent= new Intent(this, SwipOnetextOneImage.class);
        intent.putExtra("alphabet",main_title);
        intent.putExtra("text",text);
        intent.putExtra("img",img);

        intent.putExtra("sounds",sounds);
        intent.putExtra("st",st);


        startActivity(intent);
    }



     public  void draw(View view){
         Intent intent= new Intent(this, Drawing.class);
         startActivity(intent);
     }

     public  void pause(View view){
       mMediaPlayer.pause();
     }



    @Override
    protected void onResume() {
        mMediaPlayer.start();
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }
    @Override
    protected void onPause() {
        mMediaPlayer.pause();
        super.onPause();
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }
    protected void onRestart() {
        mMediaPlayer.start();
        super.onRestart();
    }
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }

      /* public void nextTrack(int i)
    {
        mMediaPlayer = new MediaPlayer();
        int []sounds={R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,R.raw.i,R.raw.j};
        mMediaPlayer = MediaPlayer.create(this, sounds[i]);
        mMediaPlayer.start();
    }*/
}
