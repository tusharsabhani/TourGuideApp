package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TouristAdapter extends ArrayAdapter<Tourist> {
    TouristAdapter(Context context,ArrayList<Tourist> tourists){
        super(context,0,tourists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tourist, parent, false);
        }

        Tourist tourist = getItem(position);

        TextView touristName = listItemView.findViewById(R.id.tourist_name);
        touristName.setText(tourist.getTouristName());

        ImageView touristImage = listItemView.findViewById(R.id.tourist_image);
        touristImage.setImageResource(tourist.getTouristImage());

        return  listItemView;
    }
}
