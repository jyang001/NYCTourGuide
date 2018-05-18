package com.example.wobofet.nyctour;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import org.w3c.dom.Attr;

import java.util.ArrayList;


public class ManhattanFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //create View
        View rootView = inflater.inflate(R.layout.fragment_manhattan, container, false);
        ArrayList<Attraction> mAttractions = new ArrayList<Attraction>();
        mAttractions.add(new Attraction(R.string.attraction_natural_history, R.string.natural_history_address, R.string.natural_history_description, R.drawable.museum_natural_history, R.string.natural_history_price));

        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, mAttractions);

        //In the View find the ListView
        ListView mView = (ListView) rootView.findViewById(R.id.manhattan_frag);
        mView.setAdapter(mFragments);

        return rootView;
    }
}
