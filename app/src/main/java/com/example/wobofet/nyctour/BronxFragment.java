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
        View result = inflater.inflate(R.layout.fragment_bronx, container, false);
        ViewPager viewPager = (ViewPager) result.findViewById(R.id.viewpager);

        //need the activity not 'this' the fragment
        CategoryAdapter categoryAdapter = new CategoryAdapter(getActivity(), getFragmentManager());
        viewPager.setAdapter(categoryAdapter);

        TabLayout tabLayout = (TabLayout) result.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        return result;
    }

    /*
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_other);

     ViewPager v = (ViewPager) findViewById(R.id.viewpager);
     CategoryAdapter a = new CategoryAdapter(this,getSupportFragmentManager());
     v.setAdapter(a);
     TabLayout t = (TabLayout) findViewById(R.id.tabs);
     t.setupWithViewPager(v);
    */
}
