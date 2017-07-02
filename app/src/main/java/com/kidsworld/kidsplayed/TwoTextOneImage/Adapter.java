package com.kidsworld.kidsplayed.TwoTextOneImage;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kidsworld.kidsplayed.R;

/**
 * Created by mdrat on 13-Jun-17.
 */

public class Adapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;

    private String [] nickname;
    private String [] alphabhet;
    private int[]images;


 public Adapter(Context context, String[] nickname, String[] alphabhet,int[]images){
     this.context=context;
    this.nickname=nickname;
     this.alphabhet=alphabhet;
     this.images=images;
 }

    @Override
    public int getCount() {
        return  nickname.length ;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==object);
    }

    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.customlayouttwotext,null);

        TextView nick=(TextView)view.findViewById(R.id.nickname);
        TextView alpha=(TextView)view.findViewById(R.id.alphabhet);
        ImageView imageView=(ImageView) view.findViewById(R.id.images);
        nick.setText(nickname[position]);
        alpha.setText(alphabhet[position]);
        imageView.setImageResource(images[position]);

        ViewPager viewPager=(ViewPager)container;
        viewPager.addView(view,0);

        return  view;
    }
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager viewPager =(ViewPager)container;
        View  view=(View)object;
        viewPager.removeView(view);
    }
}
