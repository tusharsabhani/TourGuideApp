package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list,container,false);

        final ArrayList<Hotel> hotelList = new ArrayList<>();
        hotelList.add(new Hotel("The Leela","$25",R.drawable.leela,R.drawable.leela_room));
        hotelList.add(new Hotel("Radisson Blu","$23",R.drawable.radisson_blu,R.drawable.radisson_blu_room));
        hotelList.add(new Hotel("The Oberoi","$20",R.drawable.oberoi,R.drawable.oberoi_room));
        hotelList.add(new Hotel("ITC Maurya","$24",R.drawable.itc_maurya,R.drawable.itc_maurya_room));
        hotelList.add(new Hotel("The Suryaa","$22",R.drawable.suryaa,R.drawable.suryaa_room));

        HotelAdapter adapter = new HotelAdapter(getActivity(),hotelList);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
