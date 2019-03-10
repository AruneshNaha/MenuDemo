package com.example.menudemo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.menudemo.R;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final Integer[] progImages;
    private final String[] progNames;

    public MyListAdapter(Activity context, Integer[] progImages, String[] progNames) {
        super(context, R.layout.activity_list_image,progNames);
        this.context = context;
        this.progImages = progImages;
        this.progNames = progNames;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.activity_list_image,null,true);
        TextView txtTitle=(TextView)rowview.findViewById(R.id.textv1);
        ImageView img=(ImageView)rowview.findViewById(R.id.imgv1);
        txtTitle.setText(progNames[position]);
        img.setImageResource(progImages[position]);
        return rowview;
    }
}
