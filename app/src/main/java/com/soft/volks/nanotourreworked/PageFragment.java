package com.soft.volks.nanotourreworked;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Volks on 4/22/2017.
 */
public class PageFragment extends Fragment {
    private static final String ARG_PAGE_NUMBER = "page_number";

    public PageFragment() {
    }

    public static PageFragment newInstance(int page) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE_NUMBER, page);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main, container, false);

        //TextView txt = (TextView) rootView.findViewById(R.id.titleName);
        int page = getArguments().getInt(ARG_PAGE_NUMBER, -1);
        //txt.setText(String.format("Page %d", page));

        return rootView;
    }
}
