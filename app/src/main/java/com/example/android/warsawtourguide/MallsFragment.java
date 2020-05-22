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
        places.add(new Place("Hala Koszyki", "Eighteen fabulous restaurant concepts, " +
                "eleven fantastic groceries and service premises - Warsaw's Śródmieście " +
                "regained its lost pearl. Hala Koszyki is the first and the only place of its kind in whole Poland. "));
        places.add(new Place("Westfield Arkadia Shopping Mall","There is a nice food court and " +
                "lots of shops including Polish clothing stores. All in all a great selection of stores. " +
                "Outside there is a beautiful playground for kids. This is a great place to shop for clothes, " +
                "luggage, food, etc. There is a taxi stand nearby but taxis seldom come by. " ));
        places.add(new Place("Zlote Tarasy", "Huge shopping complex. Designer brands, " +
                "prices slightly higher than other European destinations. Large variety of food outlets on top floors. " +
                "Had some wonderful Turkish food there. Easy access from central station."));
        places.add(new Place("Blue City Shopping Mall", "The Blue City shopping and entertainment " +
                "centre is a convenient and friendly place for shopping, meetings and entertainment for the whole family. " +
                "There are more than 200 shops, service points, restaurants, fast-food bars and cafes. The centre is unique in its " +
                "unusual and complete entertainment offering. On three levels (from +2 to +4) attractions for kids, youth and adults " +
                "are concentrated in a special entertainment complex which also includes the biggest fitness club in Poland. "));
        places.add(new Place("Galeria Mokotow", "Almost 250 shops on several floors make Galeria Mokotow one " +
                "of the largest shopping centers in Warsaw. Visitors may have to take a tram or bus to reach it."));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
