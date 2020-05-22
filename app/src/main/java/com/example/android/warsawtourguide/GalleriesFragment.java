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
public class GalleriesFragment extends Fragment {

    public GalleriesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.national_muzeum), getString(R.string.national_muzeum_des), R.drawable.muzeum_narodowe));
        places.add(new Place(getString(R.string.zacheta), getString(R.string.zacheta_des), R.drawable.zacheta));
        places.add(new Place(getString(R.string.muz_on_the_wis), getString(R.string.muz_on_the_wis_des), R.drawable.muzeum_on_the_visla));
        places.add(new Place(getString(R.string.fokzal), getString(R.string.fokzal_des), R.drawable.fokzal));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
