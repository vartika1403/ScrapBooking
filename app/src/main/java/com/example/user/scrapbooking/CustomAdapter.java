package com.example.user.scrapbooking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 23-05-2016.
 */
public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<Integer> landMarkImages = new ArrayList<>();
    ArrayList<Integer> landMarkNames = new ArrayList<>();

    public CustomAdapter(Context context, ArrayList<Integer> landMarkImages, ArrayList<Integer> landMarkNames) {
        this.context = context;
        this.landMarkImages = landMarkImages;
        this.landMarkNames = landMarkNames;
    }


    @Override
    public int getCount() {
        return landMarkImages.size();
    }

    @Override
    public Object getItem(int position) {
        return landMarkImages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View rowView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(rowView == null) {
            rowView = inflater.inflate(R.layout.landmark_item, null, true);
        }

        ImageView ivLandImage = (ImageView)rowView.findViewById(R.id.ivLandImage);
        TextView tvLandName = (TextView)rowView.findViewById(R.id.tvLandName);
        ivLandImage.setImageResource(landMarkImages.get(position));
        tvLandName.setText(landMarkNames.get(position));

        return rowView;


    }
}
