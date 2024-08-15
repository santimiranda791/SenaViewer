package edu.misena.senaviewer.model;

import java.util.Date;

public class Books {
    int id;
    String title;
    Date editionDate;
    String editorial;
    String authors;
    int ISBN;
    boolean readed;
    int timeReaded;

    public Books(String title, Date editionDate, String editorial, int ISBN) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.ISBN = ISBN;
    }

    // Métodos getter y setter para los atributos (opcional)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

}