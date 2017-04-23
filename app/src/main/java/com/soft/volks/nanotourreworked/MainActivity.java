package com.soft.volks.nanotourreworked;

import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.attr.fragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle(getString(R.string.app_name));

        ViewPager pager = (ViewPager)findViewById(R.id.pager);
        final TabLayout tabs = (TabLayout)findViewById(R.id.tabs);

        pager.setAdapter(new TabsPagerAdapter(getSupportFragmentManager()));

        tabs.setTabTextColors(Color.BLACK, ResourcesCompat.getColor(getResources(), android.R.color.white, null));

        tabs.setupWithViewPager(pager);
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getText().toString()){
                    case "Parks": System.out.println(tab.getText().toString());
                        break;
                    case "Interests": System.out.println(tab.getText().toString());
                        break;
                    case "Restaurants": System.out.println(tab.getText().toString());
                        break;
                    case "Museums": System.out.println(tab.getText().toString());
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
