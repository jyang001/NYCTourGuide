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
 * class to return the View for Manhattan Park Attractions
 */
public class ManhattanParkFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_manhattan_park, container, false);

        ArrayList<Attraction> parks = new ArrayList<>();
        parks.add(new Attraction(R.string.attraction_central_park, R.string.central_park_address, R.string.central_park_description, R.drawable.centralpark, R.string.central_park_price));

        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, parks);

        ListView mView = rootView.findViewById(R.id.manhattan_park_list);
        mView.setAdapter(mFragments);

        return rootView;
    }

}
