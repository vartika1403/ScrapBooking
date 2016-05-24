package com.example.user.scrapbooking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView  lvLandMark;
    CustomAdapter landMarkAdapter;
    ArrayList<Integer>  landMarkImages = new ArrayList<Integer>();
    ArrayList<Integer> landMarkNames = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvLandMark = (ListView)findViewById(R.id.lvLandMark);
        addLandMark();
        addLandMarkImages();
        landMarkAdapter = new CustomAdapter(MainActivity.this,landMarkImages,landMarkNames);
        lvLandMark.setAdapter(landMarkAdapter);

    }

    private void addLandMarkImages() {
        landMarkImages.add(R.drawable.taj_mahal);
        landMarkImages.add(R.drawable.leaning_tower_pisa);
        landMarkImages.add(R.drawable.effiel_tower);
    }

    private void addLandMark() {
        landMarkNames.add(R.string.tajmahal);
        landMarkNames.add(R.string.effieltower);
        landMarkNames.add(R.string.leaningtower);
    }
}
