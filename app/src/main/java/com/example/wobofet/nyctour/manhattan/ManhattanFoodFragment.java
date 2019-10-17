package com.example.wobofet.nyctour.manhattan;

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
 * class to return the View for Manhattan Food Attractions
 */
public class ManhattanFoodFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_manhattan_food, container, false);

        ArrayList<Attraction> foods = new ArrayList<Attraction>();
        foods.add(new Attraction(R.string.attraction_daniel, R.string.daniel_address, R.string.daniel_description, R.drawable.danielnyc, R.string.daniel_price));

        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, foods);

        //In the View find the ListView
        ListView mView = rootView.findViewById(R.id.manhattan_food_list);
        mView.setAdapter(mFragments);

        return rootView;
    }

}
