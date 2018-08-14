package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list,container,false);

        final ArrayList<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant(R.drawable.junkyard_cafe,getString(R.string.junkCafe),getString(R.string.junkCafeP),getString(R.string.junkCafeP)));
        restaurantList.add(new Restaurant(R.drawable.garam_dharam,getString(R.string.garamDharam),getString(R.string.garamDharamP),getString(R.string.garamDharamC)));
        restaurantList.add(new Restaurant(R.drawable.bercos,getString(R.string.berco),getString(R.string.bercoP),getString(R.string.bercoC)));
        restaurantList.add(new Restaurant(R.drawable.chilis,getString(R.string.chili),getString(R.string.chiliP),getString(R.string.chiliC)));
        restaurantList.add(new Restaurant(R.drawable.spezia_bistro,getString(R.string.spezia),getString(R.string.speziaP),getString(R.string.speziaC)));

        RestaurantAdapter adapter = new RestaurantAdapter(getActivity(),restaurantList);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return  rootView;
    }

}
