package edu.misena.senaviewer.model;

import java.util.Date;

public class Chapters {
    int id;
    String title;
    int duration;
    int year;
    boolean viewed;
    int timeViewed;
    int sessionNumber;

    public Chapters(String title, int duration, int year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    // Métodos getter y setter para los atributos
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int year() {
        return year();
    }

    public void setYear(int year) {
        this.year = year;
    }
}
