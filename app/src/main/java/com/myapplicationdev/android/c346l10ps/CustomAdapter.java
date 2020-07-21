package com.myapplicationdev.android.c346l10ps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Movies> movieList;

    public CustomAdapter(Context context, int resource, ArrayList<Movies> objects){
        super(context, resource,objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }
    public View getView(int position , View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id,parent,false);

        TextView tvTitle = rowView.findViewById(R.id.textViewTitle2);
        TextView tvYear = rowView.findViewById(R.id.textViewYear2);
        TextView tvGenre = rowView.findViewById(R.id.textViewGenre);
        ImageView ivRated = rowView.findViewById(R.id.imageView);

        Movies currentItem = movieList.get(position);
        tvTitle.setText(currentItem.getTitle());
        tvYear.setText(  currentItem.getYear() + " ");
        tvGenre.setText(currentItem.getGenre() + "");
        if(currentItem.getRated() == "g"){
            ivRated.setImageResource(R.drawable.rating_g);
        }else if(currentItem.getRated() == "m18"){
            ivRated.setImageResource(R.drawable.rating_m18);
        }else if(currentItem.getRated() == "nc16"){
            ivRated.setImageResource(R.drawable.rating_nc16);
        }else if(currentItem.getRated() == "pg"){
            ivRated.setImageResource(R.drawable.rating_pg);
        }else if(currentItem.getRated() == "pg13"){
            ivRated.setImageResource(R.drawable.rating_pg13);
        }else if(currentItem.getRated() == "r21"){
            ivRated.setImageResource(R.drawable.rating_r21);
        }
        return rowView;
    }

}
