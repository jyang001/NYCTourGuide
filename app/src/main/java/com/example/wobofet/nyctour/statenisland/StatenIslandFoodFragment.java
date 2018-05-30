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

public class StatenIslandFoodFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_staten_island_food, container, false);

        ArrayList<Attraction> entertainments = new ArrayList<Attraction>();
        entertainments.add(new Attraction(R.string.attraction_citifield, R.string.citifield_address, R.string.citifield_description, R.drawable.citifield, R.string.citifield_price));

        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, entertainments);

        //In the View find the ListView
        ListView mView = (ListView) rootView.findViewById(R.id.staten_island_food_list);
        mView.setAdapter(mFragments);

        return rootView;
    }
}
