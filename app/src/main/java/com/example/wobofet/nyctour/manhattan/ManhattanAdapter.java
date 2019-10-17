package com.example.wobofet.nyctour.manhattan;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.wobofet.nyctour.bronx.BronxEntertainmentFragment;
import com.example.wobofet.nyctour.bronx.BronxFoodFragment;
import com.example.wobofet.nyctour.bronx.BronxParkFragment;
import com.example.wobofet.nyctour.bronx.BronxSightsFragment;

/**
 * Adapter to display contents of Manhattan Attractions
 */
public class ManhattanAdapter extends FragmentPagerAdapter {

    private Context mContext;

    /**
     * Constructor
     * @param context: context of the app
     * @param fragmentManager: appropriate FragmentManager
     */
    public ManhattanAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
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
            return new ManhattanSightsFragment();
        } else if (position == 1) {
            return new ManhattanParkFragment();
        } else if (position == 2) {
            return new ManhattanEntertainmentFragment();
        } else {
            return new ManhattanFoodFragment();
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