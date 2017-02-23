package com.soft.volks.nanotourreworked;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionList extends AppCompatActivity {

    private final int ATTRACTION_MAX = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_list);

        Intent intent = getIntent();
        final ArrayList<Attraction> attraction = fillArrayList();

        AttractionListAdapter attractionListAdapter = new AttractionListAdapter(this, attraction);
        ListView listView = (ListView) findViewById(R.id.activity_attraction_list);
        listView.setAdapter(attractionListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(AttractionList.this, AttractionDetail.class);
                intent.putExtra("ATTRACTION", attraction.get(position));
                startActivity(intent);
            }
        });

        //System.out.println(attraction.get(0).getmAddress());

    }
    private ArrayList<Attraction> fillArrayList(){

        ArrayList<Attraction> list = new ArrayList<>();
        String[] names = getResources().getStringArray(R.array.attraction_names_PA);
        String[] address = getResources().getStringArray(R.array.attraction_address_PA);
        //int[] thumbID = setThumbIds();
        //int[] fullImgId = setFullImgId()

        for(int i = 0; i < ATTRACTION_MAX; i++){
            Attraction attraction = new Attraction();
            attraction.setmName(names[i]);
            attraction.setmAddress(address[i]);
            //attraction.setmThumbId(); //TODO Set IMG Thumb ID
            //attraction.setmImgId(); //TODO Set IMG IDS
            list.add(attraction);
        }

        return list;
    }

    private int[] setThumbIds(){
        int[] thumbIds = new int[ATTRACTION_MAX];
        //TODO SET IDS
        return thumbIds;
    }

    private int[] setFullImgId(){
        int[] fullImgID = new int[ATTRACTION_MAX];
        //TODO SET IDS
        return fullImgID;
    }
}
