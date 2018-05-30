package com.example.wobofet.nyctour.statenisland;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class StatenIslandAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public StatenIslandAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new StatenIslandSightsFragment();
        } else if (position == 1) {
            return new StatenIslandParkFragment();
        } else if (position == 2) {
            return new StatenIslandEntertainmentFragment();
        } else {
            return new StatenIslandFoodFragment();
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
