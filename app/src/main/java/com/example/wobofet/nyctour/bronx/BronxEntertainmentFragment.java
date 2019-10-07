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
 * class to return the View for Bronx Entertainment Attractions
 */
public class BronxEntertainmentFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bronx_entertainment, container, false);

        ArrayList<Attraction> entertainments = new ArrayList<Attraction>();
        entertainments.add(new Attraction(R.string.attraction_yankee_stadium, R.string.yankee_stadium_address, R.string.yankee_stadium_description, R.drawable.yankeestadium, R.string.yankee_stadium_price));

        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, entertainments);

        ListView mView = rootView.findViewById(R.id.bronx_entertainment_list);
        mView.setAdapter(mFragments);

        return rootView;
    }

}
