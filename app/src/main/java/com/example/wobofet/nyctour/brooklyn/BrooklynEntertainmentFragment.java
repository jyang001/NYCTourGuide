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

public class BrooklynEntertainmentFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_brooklyn_entertainment, container, false);

        ArrayList<Attraction> entertainments = new ArrayList<Attraction>();
        entertainments.add(new Attraction(R.string.attraction_barclays, R.string.barclays_address, R.string.barclays_description, R.drawable.barclayscenter, R.string.barclays_price));
        entertainments.add(new Attraction(R.string.attraction_luna_park, R.string.luna_park_address, R.string.luna_park_description, R.drawable.luna_park, R.string.luna_park_price));

        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, entertainments);

        //In the View find the ListView
        ListView mView = (ListView) rootView.findViewById(R.id.brooklyn_entertainment_list);
        mView.setAdapter(mFragments);

        return rootView;
    }
}