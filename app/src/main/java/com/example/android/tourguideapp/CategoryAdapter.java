package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter{

    private Context mContext;

    CategoryAdapter(Context context, FragmentManager fragmentManager){
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0)
            return new InfoFragment();
        else if(position==1)
            return new TouristFragment();
        else if(position==2)
            return new RestaurantFragment();
        else if(position ==3)
            return new  HotelFragment();
        else
            return new ShoppingFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString(R.string.info);
        else if (position == 1)
            return mContext.getString(R.string.tourist);
        else if (position == 2)
            return mContext.getString(R.string.restaurant);
        else if(position ==3)
            return mContext.getString(R.string.hotel);
        else
            return  mContext.getString(R.string.shopping);
    }
}
