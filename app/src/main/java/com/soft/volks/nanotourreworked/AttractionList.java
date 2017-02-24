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
    }
    private ArrayList<Attraction> fillArrayList(){

        ArrayList<Attraction> list = new ArrayList<>();
        String[] names = getResources().getStringArray(R.array.attraction_names_PA);
        String[] address = getResources().getStringArray(R.array.attraction_address_PA);
        String[] desc = getResources().getStringArray(R.array.attraction_desc_PA);
        int[] thumbID = setThumbIds();
        int[] fullImgId = setFullImgId();

        for(int i = 0; i < ATTRACTION_MAX; i++){
            Attraction attraction = new Attraction();
            attraction.setmName(names[i]);
            attraction.setmAddress(address[i]);
            attraction.setmThumbId(thumbID[i]);
            attraction.setmImgId(fullImgId[i]);
            attraction.setmDesc(desc[i]);
            list.add(attraction);
        }
        return list;
    }

    private int[] setThumbIds(){
        int[] thumbIds = new int[ATTRACTION_MAX];

        thumbIds[0] = R.drawable.pmhthumb;
        thumbIds[1] = R.drawable.cheesethumb;
        thumbIds[2] = R.drawable.ssmthumb;
        thumbIds[3] = R.drawable.meltthumbimg;
        thumbIds[4] = R.drawable.seethumbimg;

        return thumbIds;
    }

    private int[] setFullImgId(){
        int[] fullImgID = new int[ATTRACTION_MAX];

        fullImgID[0] = R.drawable.pizzamyheart;
        fullImgID[1] = R.drawable.cheesecakefactoryfullimg;
        fullImgID[2] = R.drawable.stanfordfullimg;
        fullImgID[3] = R.drawable.meltfullimg;
        fullImgID[4] = R.drawable.seesfullimg;

        return fullImgID;
    }
}
