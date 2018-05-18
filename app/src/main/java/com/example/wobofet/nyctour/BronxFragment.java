package com.example.wobofet.nyctour;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import org.w3c.dom.Attr;

import java.util.ArrayList;


public class BronxFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //create a rootView (want to modify this view later)
        //View rootView =  inflater.inflate(R.layout.fragment_bronx, container, false);

        View rootView =  inflater.inflate(R.layout.fragment_bronx, null);
        //final ArrayList<Attraction> bronxAttractions = new ArrayList<Attraction>();
        return rootView;
    }

}
