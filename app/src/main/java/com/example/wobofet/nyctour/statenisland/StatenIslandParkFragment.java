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


public class StatenIslandParkFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_staten_island_park, container, false);

        ArrayList<Attraction> parks = new ArrayList<Attraction>();
        parks.add(new Attraction(R.string.attraction_greenbelt, R.string.greenbelt_address, R.string.greenbelt_description, R.drawable.greenbelt, R.string.greenbelt_price));

        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, parks);

        //In the View find the ListView
        ListView mView = (ListView) rootView.findViewById(R.id.staten_island_park_list);
        mView.setAdapter(mFragments);

        return rootView;
    }
}
