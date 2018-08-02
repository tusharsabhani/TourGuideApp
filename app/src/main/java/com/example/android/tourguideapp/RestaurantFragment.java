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
        restaurantList.add(new Restaurant(R.drawable.junkyard_cafe,"Junkyard Cafe","Saket, New Delhi","Lounge - North Indian, Asian, Mediterranean"));
        restaurantList.add(new Restaurant(R.drawable.garam_dharam,"Garam Dharam","Connaught Place,New Delhi","Casual Dining - North Indian"));
        restaurantList.add(new Restaurant(R.drawable.bercos,"Berco's","Sector 12, Noida","Casual Dining - Chinese, Thai"));
        restaurantList.add(new Restaurant(R.drawable.chilis,"Chili's Grill & Bar","Ambience Mall,Vasant Kunj, New Delhi","Casual Dining - American, Italian, Mexican"));
        restaurantList.add(new Restaurant(R.drawable.spezia_bistro,"Spezia Bistro","DU - GTB Nagar, New Delhi","Cafe - Continental, Chinese, Italian"));

        RestaurantAdapter adapter = new RestaurantAdapter(getActivity(),restaurantList);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return  rootView;
    }

}
