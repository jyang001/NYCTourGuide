package com.example.wobofet.nyctour;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class QueensFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_queens, container, false);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);

        //need the activity not 'this' the fragment
        CategoryAdapter categoryAdapter = new CategoryAdapter(getActivity(), getChildFragmentManager());
        viewPager.setAdapter(categoryAdapter);

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.queens_tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_sights);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_park);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_entertainment);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_food);

        return view;
    }
}
