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


public class QueensFoodFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_queens_food, container, false);

        ArrayList<Attraction> foods = new ArrayList<Attraction>();
        foods.add(new Attraction(R.string.attraction_nanxiang, R.string.nanxiang_address, R.string.nanxiang_description, R.drawable.nan_xiang, R.string.nanxiang_price));

        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, foods);

        //In the View find the ListView
        ListView mView = (ListView) rootView.findViewById(R.id.queens_food_list);
        mView.setAdapter(mFragments);

        return rootView;
    }
}
