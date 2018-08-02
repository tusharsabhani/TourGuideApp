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

public class InfoAdapter extends ArrayAdapter<Info> {
    InfoAdapter(Context context, ArrayList<Info> infos){
        super(context,0,infos);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.info, parent, false);
        }

        Info info = getItem(position);

        TextView about = listItemView.findViewById(R.id.aboutDelhi);
        about.setText(info.getAboutDelhi());

        TextView ecology = listItemView.findViewById(R.id.ecologyDelhi);
        ecology.setText(info.getEcologyDelhi());

        TextView climate = listItemView.findViewById(R.id.climateDelhi);
        climate.setText(info.getClimateDelhi());

        return  listItemView;
    }
}
