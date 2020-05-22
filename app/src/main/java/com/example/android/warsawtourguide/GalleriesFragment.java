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
        places.add(new Place("National Museum in Warsaw", "The National Museum in " +
                "Warsaw was founded in 1862 as the Museum of Fine Arts and is one of the oldest museums in Poland. " +
                "The modernist building where it`s located currently was built between 1927-1938 and it`s " +
                "one of the most important buildings of that time in Warsaw (Tadeusz Tołwiński`s project).", R.drawable.muzeum_narodowe));
        places.add(new Place("Zachęta – National Gallery of Art", "Zachęta is one of the oldest galleries in Poland. " +
                "The beautiful building was constructed between 1898-1900 according to project of Stefan Szyller. " +
                "Gallery presented all the most important Polish artists’ including Wojciech Gerson, Jan Matejko, Józef Chełmoński, " +
                "or Stanisław Wyspiański.", R.drawable.zacheta));
        places.add(new Place("Museum on the Vistula – Museum of Modern Art", "The Museum on the Vistula is a new exhibition " +
                "pavilion of the Museum of Modern Art in Warsaw. It`s located at Wybrzeże " +
                "Kościuszkowskie 22, next to the Copernicus Science Center and Vistula river.", R.drawable.muzeum_on_the_visla));
        places.add(new Place("Foksal Gallery", "Foksal Gallery was founded in 1966 so it`s the oldest and one of the most " +
                "prominant galleries of modern art in Poland. The gallery is focused on searching out and " +
                "highlighting radical approaches to contemporary art.", R.drawable.fokzal));
        places.add(new Place("Centre for Contemporary Art Ujazdowski Castle", "The Centre for Contemporary Art Ujazdowski " +
                "Castle is a very active institution presenting contemporary ar of all kinds of genres and forms. " +
                "It organizes exhibitions of photography, paintings or video installations.", R.drawable.park_agrykola));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
