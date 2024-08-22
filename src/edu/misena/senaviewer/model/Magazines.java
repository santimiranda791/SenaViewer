package edu.misena.senaviewer.model;

import java.util.Date;

public class Magazines {
    int id;
    String title;
    int editionDate;
    String editorial;
    String authors;
    public Magazines(String title, int editionDate, String editorial) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;

    }

    // Métodos getter y setter para los atributos
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(int editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
