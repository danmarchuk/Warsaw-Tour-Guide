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
public class CinemasFragment extends Fragment {

    public CinemasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container,false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Kino Muranow", "In 2004, Kino Muranow won the “Europa Cinemas Award” for Best" +
                " Cinema in Europe in terms of repertoire. Among this repertoire, you can find an English " +
                "Friendly Movie Cycle of non-English movies (including Polish movies) with English subtitles."));
        places.add(new Place("Kino Wisla", "Kino Wisła also organizes Polish Film For Foreigners, a super " +
                "cool series of screening about (you guessed it) Polish Movies with English subtitles. " +
                "After the screenings, there are usually meetings with the actors or with the director of the movie."));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
