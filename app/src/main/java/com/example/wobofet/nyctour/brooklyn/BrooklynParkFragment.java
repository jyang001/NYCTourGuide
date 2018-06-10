package com.example.wobofet.nyctour.brooklyn;

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

public class BrooklynParkFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_brooklyn_park, container, false);

        ArrayList<Attraction> parks = new ArrayList<Attraction>();
        parks.add(new Attraction(R.string.attraction_prospectpark, R.string.prospectpark_address, R.string.prospectpark_description, R.drawable.prospectpark, R.string.prospectpark_price));
        parks.add(new Attraction(R.string.attraction_fort_greene, R.string.fort_greene_address, R.string.fort_greene_description, R.drawable.fort_greene, R.string.fort_greene_price));

        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, parks);

        //In the View find the ListView
        ListView mView = (ListView) rootView.findViewById(R.id.brooklyn_park_list);
        mView.setAdapter(mFragments);

        return rootView;
    }
}