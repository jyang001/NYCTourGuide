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

public class BrooklynSightsFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_brooklyn_sights, container, false);

        ArrayList<Attraction> sights = new ArrayList<Attraction>();
        sights.add(new Attraction(R.string.attraction_destefano, R.string.destefano_address, R.string.destefano_description, R.drawable.brooklynmuseum, R.string.destefano_history_price));

        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, sights);

        //In the View find the ListView
        ListView mView = (ListView) rootView.findViewById(R.id.brooklyn_sights_list);
        mView.setAdapter(mFragments);

        return rootView;
    }
}