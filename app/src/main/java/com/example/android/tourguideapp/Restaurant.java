package com.example.android.tourguideapp;

public class Restaurant {

    private int resImage;
    private String resName;
    private String resPlace;
    private String resCuisine;

    Restaurant(int image,String name,String place,String cuisine){
        resCuisine = cuisine;
        resImage = image;
        resName = name;
        resPlace = place;
    }

    public int getResImage(){return resImage;}
    public String getResName(){return resName;}
    public String getResPlace(){return resPlace;}
    public String getResCuisine(){return resCuisine;}
}
