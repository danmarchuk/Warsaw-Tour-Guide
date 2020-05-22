package com.example.android.warsawtourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShopsFragment extends Fragment {

    public ShopsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container,false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Star Wines Poland", "There are more than 400 wines from the " +
                "whole world available for retail purchase at Star Wines Poland  manufactured both by the most highly acknowledged " +
                "producers and niche vineyards; the award-winning wine selection" +
                " recognized by the prestigious Wine Spectator will make for a good purchase."));
        places.add(new Place("Olimpia Bazaar", "Within a week, there is a sports club in here. " +
                "On Sunday, the stadium turns into a big market. On Olympia, the bazaar at Górczewska street you can buy antiquities, clothing and tools." +
                "Old newspapers, books, that you can not get up even in antique shops, used shoes - it all adds up to a peculiar charm of this place."));
        places.add(new Place("Quality Missala Perfumery", "Quality Missala Perfumery in the Warsaw Marriott Hotel is an exceptional boutique," +
                " which stocks the finest niche perfumes from around the world, some of them being available just in a few perfumeries in Europe."));
        places.add(new Place("Rozycki Bazaar", "The Rozycki Bazaar is the last continuously " +
                "trading historical bazaar in Warsaw. Founded 102 years ago it is also the oldest bazaar in Warsaw." +
                "In addition to its commercial activities throughout the years, Rozycki Bazaar has become a mainstay of Warsaw folklore " +
                "and humour. The advertising and sales shouts of the vendors have become " +
                "common sayings, even finding their way to the cabaret scene in Warsaw."));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
