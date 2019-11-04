package com.example.wobofet.nyctour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * represents an adapter to hold Attraction classes
 */
public class AttractionAdapter extends ArrayAdapter<Attraction> {

    private int colorResourceID;

    public AttractionAdapter(Activity context, int getResourceID, ArrayList<Attraction> A) {
        super(context, 0, A);
        colorResourceID = getResourceID;
    }

    /**
     * method to populate View with content we need
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

        TextView placeName = listItemView.findViewById(R.id.place_name);
        TextView address = listItemView.findViewById(R.id.address);
        TextView description = listItemView.findViewById(R.id.description);
        TextView cost = listItemView.findViewById(R.id.cost);
        ImageView resource = listItemView.findViewById(R.id.list_image);

        placeName.setText(currentAttraction.getName());
        address.setText(currentAttraction.getAddress());
        description.setText(currentAttraction.getDescription());
        cost.setText(currentAttraction.getCost());

        resource.setBackgroundResource(currentAttraction.getResourceID());
        return listItemView;
    }

}
