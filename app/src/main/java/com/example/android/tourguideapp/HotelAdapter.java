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

public class HotelAdapter extends ArrayAdapter<Hotel>{
    HotelAdapter(Context context, ArrayList<Hotel> hotels){
        super(context,0,hotels);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.hotels, parent, false);
        }

        Hotel hotel = getItem(position);

        TextView hotelName = listItemView.findViewById(R.id.hotelName);
        hotelName.setText(hotel.getHotelName());

        TextView hotelPrice = listItemView.findViewById(R.id.price);
        hotelPrice.setText(hotel.getHotelPrice());

        ImageView hotelImage1 = listItemView.findViewById(R.id.image1);
        hotelImage1.setImageResource(hotel.getHotelImage1());

        ImageView hotelImage2 = listItemView.findViewById(R.id.image2);
        hotelImage2.setImageResource(hotel.getHotelImage2());

        return listItemView;
    }
}
