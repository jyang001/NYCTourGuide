package com.example.wobofet.nyctour;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import java.util.ArrayList;

public class AttractionAdapter extends FragmentPagerAdapter {

    private Context aContext;

    public AttractionAdapter(Context context, FragmentManager fm) {
        super(fm);
        aContext = context;
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

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return aContext.getString(R.string.category_brooklyn);
        }
        else if (position == 1) {
            return aContext.getString(R.string.category_queens);
        }
        else if (position == 2) {
            return aContext.getString(R.string.category_manhattan);
        }
        else if (position == 3) {
            return aContext.getString(R.string.category_bronx);
        }
        else
            return aContext.getString(R.string.category_staten_island);
    }

}
