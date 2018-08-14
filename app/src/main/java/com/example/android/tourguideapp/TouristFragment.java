package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TouristFragment extends Fragment {


    public TouristFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list,container,false);

        final ArrayList<Tourist> touristList = new ArrayList<>();
        touristList.add(new Tourist(getString(R.string.akshar),R.drawable.akshardham_temple));
        touristList.add(new Tourist(getString(R.string.bangla),R.drawable.bangla_sahib_gurudwara));
        touristList.add(new Tourist(getString(R.string.hauz),R.drawable.hauz_khas_fort));
        touristList.add(new Tourist(getString(R.string.india),R.drawable.india_gate));
        touristList.add(new Tourist(getString(R.string.lotus),R.drawable.lotus_temple));
        touristList.add(new Tourist(getString(R.string.qutub),R.drawable.qutub_minar));
        touristList.add(new Tourist(getString(R.string.old),R.drawable.old_fort));
        touristList.add(new Tourist(getString(R.string.rashtra),R.drawable.rashtrapati_bhavan));
        touristList.add(new Tourist(getString(R.string.red),R.drawable.red_fort));
        touristList.add(new Tourist(getString(R.string.select),R.drawable.select_citywalk_mall));

        TouristAdapter adapter = new TouristAdapter(getActivity(),touristList);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return  rootView;
    }

}
