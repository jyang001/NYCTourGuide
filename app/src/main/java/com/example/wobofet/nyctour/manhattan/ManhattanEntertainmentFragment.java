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


public class ManhattanEntertainmentFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_manhattan_entertainment, container, false);

        ArrayList<Attraction> entertainments = new ArrayList<Attraction>();
        entertainments.add(new Attraction(R.string.attraction_natural_history, R.string.natural_history_address, R.string.natural_history_description, R.drawable.museum_natural_history, R.string.natural_history_price));

        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, entertainments);

        //In the View find the ListView
        ListView mView = (ListView) rootView.findViewById(R.id.manhattan_entertainment_list);
        mView.setAdapter(mFragments);

        return rootView;
    }
}
