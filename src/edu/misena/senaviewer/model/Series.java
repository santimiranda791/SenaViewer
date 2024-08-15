package edu.misena.senaviewer.model;

import java.util.Date;

public class Series {
    int id;
    String title;
    String genre;
    String creator;
    int duration;
    Date year;
    boolean viewed;
    int timeViewed;

    public Series(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    // Métodos getter y setter para los atributos
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String genre() {
        return genre();
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    }

