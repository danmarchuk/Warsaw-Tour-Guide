package com.example.android.warsawtourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);}

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView placeNameTextView = listItemView.findViewById(R.id.name_of_the_place_text_view);
        placeNameTextView.setText(currentPlace.getName());

        TextView descriptionTextView = listItemView.findViewById(R.id.place_description_text_view);
        descriptionTextView.setText(currentPlace.getDescription());

        ImageView imageResourseId = (ImageView) listItemView.findViewById(R.id.image);
        if (currentPlace.hasImage()) {
            imageResourseId.setImageResource(currentPlace.getImage());
        } else {
            imageResourseId.setVisibility(View.GONE);
        }

        return listItemView;
    }

}
