package com.example.wobofet.nyctour;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import org.w3c.dom.Attr;

import java.util.ArrayList;


public class BronxFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bronx, container, false);
        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);

        //need the activity not 'this' the fragment
        CategoryAdapter categoryAdapter = new CategoryAdapter(getActivity(), getChildFragmentManager());
        viewPager.setAdapter(categoryAdapter);

        final TabLayout tabLayout = (TabLayout) view.findViewById(R.id.bronx_tabs);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_sights);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_park);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_entertainment);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_food);

        return view;
    }
}
