package com.example.wobofet.nyctour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BronxFragment();
        } else if (position == 1){
            return new ManhattanFragment();
        } else if (position == 2 ) {
            return new BrooklynFragment();
        }
        else if (position == 3) {
            return new QueensFragment();
        }
        else {
            return new StatenIslandFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_bronx);
        } else if (position == 1){
            return mContext.getString(R.string.category_manhattan);
        } else if (position == 2 ) {
            return mContext.getString(R.string.category_brooklyn);
        }
        else if (position == 3) {
            return mContext.getString(R.string.category_queens);
        }
        else {
            return mContext.getString(R.string.category_staten_island);
        }
    }
}
