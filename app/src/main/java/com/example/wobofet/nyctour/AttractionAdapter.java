package com.example.wobofet.nyctour;

import android.app.Activity;
import android.content.Context;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class AttractionAdapter extends FragmentPagerAdapter {

    public AttractionAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BrooklynFragment();
        } else if (position == 1){
            return new QueensFragment();
        } else if (position == 2 ) {
            return new ManhattanFragment();
        }
        else if (position == 3) {
            return new BronxFragment();
        }
        else {
            return new StatenIslandFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

}
