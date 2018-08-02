package com.example.android.tourguideapp;

public class Hotel {

        private String hotelName;
        private String hotelPrice;
        private int hotelImage1;
        private int hotelImage2;

        Hotel(String hN,String hP,int hI1,int hI2){
            hotelName = hN;
            hotelPrice = hP;
            hotelImage1 = hI1;
            hotelImage2 = hI2;
        }

        public String getHotelName(){
            return hotelName;
        }
        public String getHotelPrice(){ return hotelPrice;}
        public int getHotelImage1(){ return hotelImage1;}
        public int getHotelImage2(){ return hotelImage2;}

}
