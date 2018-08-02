package com.example.android.tourguideapp;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {
    RestaurantAdapter(Context context, ArrayList<Restaurant> restaurants){
        super(context,0,restaurants);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.restaurant, parent, false);
        }

        Restaurant restaurant = getItem(position);

        ImageView restaurantImage = listItemView.findViewById(R.id.res_image);
        restaurantImage.setImageResource(restaurant.getResImage());

        TextView restaurantName = listItemView.findViewById(R.id.res_name);
        restaurantName.setText(restaurant.getResName());

        TextView restaurantPlace = listItemView.findViewById(R.id.res_place);
        restaurantPlace.setText(restaurant.getResPlace());

        TextView restaurantCuisine = listItemView.findViewById(R.id.res_cuisine);
        restaurantCuisine.setText(restaurant.getResCuisine());

        return listItemView;

    }
}
