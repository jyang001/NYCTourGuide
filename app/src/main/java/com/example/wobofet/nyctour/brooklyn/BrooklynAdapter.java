package com.example.wobofet.nyctour.brooklyn;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;

import com.example.wobofet.nyctour.EntertainmentFragment;
import com.example.wobofet.nyctour.FoodFragment;
import com.example.wobofet.nyctour.ParkFragment;
import com.example.wobofet.nyctour.SightsFragment;

public class BrooklynAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public BrooklynAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new ParkFragment();
        } else if (position == 2) {
            return new EntertainmentFragment();
        } else {
            return new BrooklynFoodFragment();
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


