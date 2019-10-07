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
 * class to return the View for Bronx Food Attractions
 */
public class BronxFoodFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bronx_food, container, false);

        ArrayList<Attraction> foods = new ArrayList<Attraction>();
        foods.add(new Attraction(R.string.attraction_denino, R.string.denino_address, R.string.denino_description, R.drawable.denino, R.string.denino_price));

        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, foods);

        ListView mView = rootView.findViewById(R.id.bronx_food_list);
        mView.setAdapter(mFragments);

        return rootView;
    }

}

