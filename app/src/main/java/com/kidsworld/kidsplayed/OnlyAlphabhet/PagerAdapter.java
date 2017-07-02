package com.kidsworld.kidsplayed.OnlyAlphabhet;

import android.content.Context;
import android.media.ImageReader;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kidsworld.kidsplayed.R;

import java.util.zip.Inflater;

/**
 * Created by mdrat on 07-Jun-17.
 */

public class PagerAdapter extends android.support.v4.view.PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private String [] SmallAplha;

    public String[] getSmallAplha() {
        return SmallAplha;
    }

    public void setSmallAplha(String[] smallAplha) {
        SmallAplha = smallAplha;
    }

    public String[] getCapAlpha() {
        return CapAlpha;
    }

    public void setCapAlpha(String[] capAlpha) {
        CapAlpha = capAlpha;
    }

    private String [] CapAlpha;



    public PagerAdapter(Context context ,String[]capAlpha,String[]smallAplha) {
        this.context = context;
        this.CapAlpha=capAlpha;
        this.SmallAplha=smallAplha;
    }

    @Override
    public int getCount() {
        return SmallAplha.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.customlayout,null);
        //ImageView imageView=(ImageView) view.findViewById(R.id.customimage);
        TextView capalpha=(TextView) view.findViewById(R.id.capalpha);
        TextView smallalpha=(TextView) view.findViewById(R.id.smallalpha);


        capalpha.setText(CapAlpha[position]);
        smallalpha.setText(SmallAplha[position]);



        ViewPager viewPager=(ViewPager)container;
        viewPager.addView(view,0);
        return  view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager viewPager =(ViewPager)container;
        View  view=(View)object;
        viewPager.removeView(view);
    }

}
