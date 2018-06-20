package com.example.wobofet.nyctour.statenisland;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.wobofet.nyctour.Attraction;
import com.example.wobofet.nyctour.AttractionAdapter;
import com.example.wobofet.nyctour.R;

import java.util.ArrayList;


public class StatenIslandSightsFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_staten_island_sights, container, false);

        ArrayList<Attraction> sights = new ArrayList<Attraction>();
        sights.add(new Attraction(R.string.attraction_national_lighthouse, R.string.national_lighthouse_address, R.string.national_lighthouse_description, R.drawable.national_lighthouse, R.string.national_lighthouse_price));

        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, sights);

        //In the View find the ListView
        ListView mView = (ListView) rootView.findViewById(R.id.staten_island_sights_list);
        mView.setAdapter(mFragments);

        return rootView;
    }
}
