package com.kidsworld.kidsplayed.OnlyAlphabhet;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.kidsworld.kidsplayed.R;


public class Alphabate extends Activity {

    //Initializing Varriable


    ViewPager viewPager;
    MediaPlayer mMediaPlayer;
    TextView textView;
    private AdView mAdView,mAdview2;
    InterstitialAd mInterstitialAd;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabate);
        String [] capital =getIntent().getStringArrayExtra("capital");
        String [] small =  getIntent().getStringArrayExtra("small");


        //Set varriable for each activity with gatter_satter
       /* PagerAdapter adapter=new PagerAdapter(this,capital,small);
        adapter.setCapAlpha(capital);
        adapter.setSmallAplha(small);*/
        String  maintitle =  getIntent().getStringExtra("alphabet");
        textView=(TextView)findViewById(R.id.maintitle);
        textView.setText(maintitle);

        mMediaPlayer = new MediaPlayer();
        mMediaPlayer = MediaPlayer.create(this,R.raw.a);
        mMediaPlayer.start();

        //set ViewPager OneAdapter for swip view
        viewPager=(ViewPager) findViewById(R.id.pager);
        android.support.v4.view.PagerAdapter pagerAdapter =new PagerAdapter(this,capital,small);
        viewPager.setAdapter(pagerAdapter);



        //Swipe View Get Position and play voice
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            public void onPageScrollStateChanged(int state) {}
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

            public void onPageSelected(int position) {
              //  Toast.makeText(getApplicationContext(),"pos"+position,Toast.LENGTH_LONG).show();
                nextTrack(position);
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen));

        mAdView = (AdView) findViewById(R.id.adView);
        mAdview2=(AdView)findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
        mAdview2.loadAd(adRequest);

        mInterstitialAd.loadAd(adRequest);

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });

    }
    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }

    //Meida  _player function
    public void nextTrack(int i)
    {
        int []sounds=getIntent().getIntArrayExtra("sounds");
        if (mMediaPlayer != null) {
            mMediaPlayer.release(); // release any previously played / held resources
        }
        mMediaPlayer = new MediaPlayer();
        mMediaPlayer = MediaPlayer.create(this, sounds[i]);
        mMediaPlayer.start();
    }



    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        if (mAdview2 != null) {
            mAdview2.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
        if (mAdview2 != null) {
            mAdview2.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        if (mAdview2 != null) {
            mAdview2.destroy();
        }
        super.onDestroy();
    }

}
