package edu.misena.senaviewer.model;

import java.util.Date;

public class Series extends Film {
    int id;
    String title;
    String genre;
    String creator;
    int duration;
    int year;
    boolean viewed;
    int timeViewed;

    public Series(String title, String genre, String creator, int duration) {
        super(title, genre, creator, duration);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "Serie{" +
                super.toString() +
                ", id=" + id +
                ", title=" + title +
                ", genre=" + genre +
                ", creator=" + creator +
                ", duration=" + duration +
                ", year=" + year +
                ", viewed=" + viewed +
                ", timeViewed=" + timeViewed +
                '}';
    }
    }

