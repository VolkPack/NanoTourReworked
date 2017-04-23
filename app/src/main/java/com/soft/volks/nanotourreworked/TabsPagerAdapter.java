package com.soft.volks.nanotourreworked;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import java.util.ArrayList;

/**
 * Created by Volks on 4/22/2017.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {
    private final int TOTAL_TABS = 4;

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return TOTAL_TABS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ArrayList<String> tabs = new ArrayList<>();
        tabs.add("Interests");
        tabs.add("Restaurants");
        tabs.add("Parks");
        tabs.add("Museums");

        return tabs.get(position);
    }
}