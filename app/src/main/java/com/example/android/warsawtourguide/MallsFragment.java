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
public class MallsFragment extends Fragment {

    public MallsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container,false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.halakosz), getString(R.string.halakosz_des)));
        places.add(new Place(getString(R.string.arkadia),getString(R.string.arkadia_des) ));
        places.add(new Place(getString(R.string.zlote_tar), getString(R.string.zlote_tar_des)));
        places.add(new Place(getString(R.string.galeria_mok), getString(R.string.galeria_mok_des)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
