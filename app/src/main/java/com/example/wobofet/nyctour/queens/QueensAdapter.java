package com.example.wobofet.nyctour.queens;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class QueensAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public QueensAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new QueensSightsFragment();
        } else if (position == 1) {
            return new QueensParkFragment();
        } else if (position == 2) {
            return new QueensEntertainmentFragment();
        } else {
            return new QueensFoodFragment();
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
