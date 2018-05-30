package com.example.wobofet.nyctour.manhattan;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.wobofet.nyctour.bronx.BronxEntertainmentFragment;
import com.example.wobofet.nyctour.bronx.BronxFoodFragment;
import com.example.wobofet.nyctour.bronx.BronxParkFragment;
import com.example.wobofet.nyctour.bronx.BronxSightsFragment;

public class ManhattanAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public ManhattanAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ManhattanSightsFragment();
        } else if (position == 1) {
            return new ManhattanParkFragment();
        } else if (position == 2) {
            return new ManhattanEntertainmentFragment();
        } else {
            return new ManhattanFoodFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    public CharSequence getPageTitle(int position) {
        return null;
    }
}