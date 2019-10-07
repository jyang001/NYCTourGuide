package com.example.wobofet.nyctour.bronx;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Adapter to display contents of Bronx Attractions
 */
public class BronxAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public BronxAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * method that returns the correct fragment based on the screen selection
     * @param position: position on screen
     * @return Fragment object to display correct Attractions
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BronxSightsFragment();
        } else if (position == 1) {
            return new BronxParkFragment();
        } else if (position == 2) {
            return new BronxEntertainmentFragment();
        } else {
            return new BronxFoodFragment();
        }
    }

    /**
     * method to get the number of Fragments of the Bronx Adapter
     * @return: number of fragments
     */
    @Override
    public int getCount() {
        return 4;
    }

    public CharSequence getPageTitle(int position) {
        return null;
    }
}
