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

public class ShoppingAdapter extends ArrayAdapter<Shopping> {
    ShoppingAdapter(Context context, ArrayList<Shopping> shoppings){
        super(context,0,shoppings);}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.shopping, parent, false);
        }

        Shopping shopping = getItem(position);

        ImageView image = listItemView.findViewById(R.id.shopImage);
        image.setImageResource(shopping.getImage());

        TextView text = listItemView.findViewById(R.id.description);
        text.setText(shopping.getDescription());

        return listItemView;
    }
}
