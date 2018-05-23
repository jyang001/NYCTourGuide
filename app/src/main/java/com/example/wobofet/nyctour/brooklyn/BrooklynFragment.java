package com.example.wobofet.nyctour.brooklyn;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wobofet.nyctour.CategoryAdapter;
import com.example.wobofet.nyctour.R;

public class BrooklynFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_brooklyn, container, false);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.brooklyn_viewpager);

        //need the activity not 'this' the fragment
        BrooklynAdapter brooklynAdapter = new BrooklynAdapter(getActivity(), getFragmentManager());
        viewPager.setAdapter(brooklynAdapter);

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.brookyln_tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_sights);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_park);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_entertainment);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_food);

        return view;
    }
}
