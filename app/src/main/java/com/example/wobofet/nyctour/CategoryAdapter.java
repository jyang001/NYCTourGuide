package com.example.wobofet.nyctour;

import android.content.Context;
import android.graphics.drawable.Drawable;
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
            return new SightsFragment();
        } else if (position == 1) {
            return new ParkFragment();
        } else if (position == 2) {
            return new EntertainmentFragment();
        } else {
            return new FoodFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    public CharSequence getPageTitle(int position) {
        /*
        if (position == 0) {
            return mContext.getResources().getDrawable(R.drawable.ic_remove_red_eye);
            //return mContext.getString(R.string.category_sights);
        } else if (position == 1) {
            return mContext.getResources().getDrawable(R.drawable.ic_remove_red_eye);
        } else if (position == 2) {
            return mContext.getResources().getDrawable(R.drawable.ic_remove_red_eye);
        } else {
            return mContext.getResources().getDrawable(R.drawable.ic_remove_red_eye);
        }
    }
    */
        return null;
    }
}


