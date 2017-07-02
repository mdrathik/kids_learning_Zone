package com.kidsworld.kidsplayed.OneTextOneImage;

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
 * Created by mdrat on 14-Jun-17.
 */

public class OneAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;

    private String[] text;
    private int[] images;


    public OneAdapter(Context context, String[] text, int[] images) {
        this.context = context;
        this.text = text;
        this.images = images;
    }

    @Override
    public int getCount() {
        return text.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }

    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_onetext_oneimage, null);

        TextView textView = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.images);
        textView.setText(text[position]);
        imageView.setImageResource(images[position]);

        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view, 0);

        return view;
    }

    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView(view);
    }
}
