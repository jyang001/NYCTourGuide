package com.example.wobofet.nyctour.queens;

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

public class QueensParkFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_queens_park, container, false);

        ArrayList<Attraction> parks = new ArrayList<Attraction>();
        parks.add(new Attraction(R.string.attraction_coronapark, R.string.coronapark_address, R.string.coronapark_description, R.drawable.coronapark, R.string.coronapark_price));

        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, parks);

        //In the View find the ListView
        ListView mView = (ListView) rootView.findViewById(R.id.queens_park_list);
        mView.setAdapter(mFragments);

        return rootView;
    }
}

