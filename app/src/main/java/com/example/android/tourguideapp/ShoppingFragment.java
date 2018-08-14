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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list,container,false);

        final ArrayList<Shopping> shoppingList = new ArrayList<>();
        shoppingList.add(new Shopping(R.drawable.cp,getString(R.string.cp)));
        shoppingList.add(new Shopping(R.drawable.palika_bazar,getString(R.string.palika)));
        shoppingList.add(new Shopping(R.drawable.dili_hatt_market,getString(R.string.dilliHaat)));

        ShoppingAdapter adapter = new ShoppingAdapter(getActivity(),shoppingList);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
