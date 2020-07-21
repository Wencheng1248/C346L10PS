package com.myapplicationdev.android.c346l10ps;

import java.util.Calendar;

public class Movies {
    private String title;
    private int year;
    private String rated;
    private String genre;
    private String watchedOn;
    private String in_theater;
    private String description;

    public Movies(String title, int year, String rated, String genre, String watchedOn, String in_theater, String description) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        this.watchedOn = watchedOn;
        this.in_theater = in_theater;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWatchedOn() {
        return watchedOn;
    }

    public void setWatchedOn(String watchedOn) {
        this.watchedOn = watchedOn;
    }

    public String getIn_theater() {
        return in_theater;
    }

    public void setIn_theater(String in_theater) {
        this.in_theater = in_theater;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
