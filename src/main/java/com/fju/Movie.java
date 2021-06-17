package com.fju;


public abstract class Movie {
    String movie;
    String time;
    int money;

    public Movie(String movie, String time, int money){
        this.movie = movie;
        this.time = time;
        this.money = money;
    }
}
