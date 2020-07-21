package com.myapplicationdev.android.c346l10ps;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Movies> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovies);
        alMovieList = new ArrayList<>();
        Movies item1 = new Movies("The Avengers",2012,"pg13","Action|Sci-Fi","15/11/2014","Golden Village - Bishan","Nick Fury of S.H.I.E.L.D. assembles a team if superheros to save the planet from Loki and his army");
        Movies item2 = new Movies("Planes",2013,"pg","Animation|Comedy","15/5/2015","Cathy-AMK Hub","A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race");
        alMovieList.add(item1);
        alMovieList.add(item2);

        caMovie = new CustomAdapter(this,R.layout.row,alMovieList);
        lvMovie.setAdapter(caMovie);

        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this , detailsActivity.class);

                Movies currentMovie = alMovieList.get(i);
                intent.putExtra("title",currentMovie.getTitle());
                intent.putExtra("year",currentMovie.getYear());
                intent.putExtra("rated",currentMovie.getRated());
                intent.putExtra("genre",currentMovie.getGenre());
                intent.putExtra("watchedOn",currentMovie.getWatchedOn());
                intent.putExtra("theater",currentMovie.getIn_theater());
                intent.putExtra("desc",currentMovie.getDescription());

                
            }
        });
    }}
