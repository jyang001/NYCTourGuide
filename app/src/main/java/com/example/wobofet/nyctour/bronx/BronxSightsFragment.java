package com.example.wobofet.nyctour.bronx;

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

/**
 * class to return the View for Bronx Sights Attractions
 */
public class BronxSightsFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bronx_sights, container, false);

        ArrayList<Attraction> sights = new ArrayList<Attraction>();
        sights.add(new Attraction(R.string.attraction_bronx_zoo, R.string.bronx_zoo_address, R.string.bronx_zoo_description, R.drawable.bronx_zoo, R.string.bronx_zoo_price));
        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, sights);

        ListView mView = rootView.findViewById(R.id.bronx_sights_list);
        mView.setAdapter(mFragments);

        return rootView;
    }

}