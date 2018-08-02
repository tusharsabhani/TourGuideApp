package com.example.android.tourguideapp;

public class Tourist {

    private String touristName;
    private int touristImage;

    Tourist(String tN,int tI){
        touristName = tN;
        touristImage = tI;
    }

    public String getTouristName(){ return touristName ;}
    public int getTouristImage(){ return touristImage ;}
}
