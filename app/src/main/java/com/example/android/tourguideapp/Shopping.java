package com.example.android.tourguideapp;

public class Shopping {

    private int image;
    private String description;

    Shopping(int ima,String des){
        image = ima;
        description = des;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
