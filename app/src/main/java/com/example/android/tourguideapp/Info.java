package com.example.android.tourguideapp;

public class Info {
    
    private int aboutDelhi;
    private int ecologyDelhi;
    private int climateDelhi;
    
    Info(int about,int ecology,int climate){
        aboutDelhi = about;
        ecologyDelhi = ecology;
        climateDelhi = climate;
    }

    public int getAboutDelhi() {return aboutDelhi;}
    public int getClimateDelhi() {return climateDelhi; }
    public int getEcologyDelhi() {return ecologyDelhi;}
}
