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
 * class to return the View for Manhattan Sights Attractions
 */
public class ManhattanSightsFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_manhattan_sights, container, false);

        ArrayList<Attraction> sights = new ArrayList<>();
        sights.add(new Attraction(R.string.attraction_empire_state, R.string.empire_state_address, R.string.empire_state_description, R.drawable.empirestate, R.string.empire_state_price));
        sights.add(new Attraction(R.string.attraction_rockefeller, R.string.rockefeller_address, R.string.rockefeller_description, R.drawable.rockefellercenter, R.string.rockefeller_price));

        AttractionAdapter mFragments = new AttractionAdapter(getActivity(), R.color.colorPrimaryDark, sights);

        ListView mView = rootView.findViewById(R.id.manhattan_sights_list);
        mView.setAdapter(mFragments);

        return rootView;
    }

}
