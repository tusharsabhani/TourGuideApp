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
public class InfoFragment extends Fragment {


    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list,container,false);

        final ArrayList<Info> info = new ArrayList<>();
        info.add(new Info(R.string.about,R.string.ecology,R.string.climate));

        InfoAdapter adapter = new InfoAdapter(getActivity(),info);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return  rootView;
    }

}
