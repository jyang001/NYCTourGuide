package com.example.wobofet.nyctour;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    private int colorResourceID;


    public AttractionAdapter(Activity context, int getResourceID, ArrayList<Attraction> A) {
        super(context, 0, A);
        colorResourceID = getResourceID;
    }

    /**
     * Recycle views
     * @param pos position in adapter that we want
     * @param convertView view to recycle
     * @param parent parent view that view will be attached to
     * @return populated View
     */
    public View getView(int pos, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            LayoutInflater LI = LayoutInflater.from(getContext());
            listItemView = LI.inflate(R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(pos);

        TextView placeName = (TextView) listItemView.findViewById(R.id.place_name);
        TextView address = (TextView) listItemView.findViewById(R.id.address);
        TextView description = (TextView) listItemView.findViewById(R.id.description);
        TextView cost = (TextView) listItemView.findViewById(R.id.cost);
        ImageView resource = (ImageView) listItemView.findViewById(R.id.list_image);

        currentAttraction.setName(currentAttraction.getName());
        currentAttraction.setAddress(currentAttraction.getAddress());
        currentAttraction.setDescription(currentAttraction.getDescription());
        currentAttraction.setResourceID(currentAttraction.getResourceID());
        currentAttraction.setCost(currentAttraction.getCost());

        return listItemView;
    }
}
