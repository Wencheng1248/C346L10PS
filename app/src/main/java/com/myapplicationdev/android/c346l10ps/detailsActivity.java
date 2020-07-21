package com.myapplicationdev.android.c346l10ps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class detailsActivity extends AppCompatActivity {
    TextView title,year,genre,desc,date,location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        title = findViewById(R.id.textViewTitle2);
        year = findViewById(R.id.textViewYear2);
        genre = findViewById(R.id.textViewGenre2);
        desc = findViewById(R.id.textViewDescription);
        date = findViewById(R.id.textViewWatchedOn);
        location = findViewById(R.id.textViewLocation);


    }
}
