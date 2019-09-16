package com.example.zarme.myapplication;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position ==0){
            return PlaceholderFragment1.newInstance(position + 1);
        }
        if(position ==1){
            return PlaceholderFragment2.newInstance(position + 1);
        }
        if(position ==2){
            return PlaceholderFragment4.newInstance(position + 1);
        }
        if(position ==3){
            return PlaceholderFragment3.newInstance(position + 1);
        }
        else{
            return PlaceholderFragment2.newInstance(position + 1);
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 4;
    }
}
