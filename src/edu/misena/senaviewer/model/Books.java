package edu.misena.senaviewer.model;

import java.util.Date;

public class Books extends Publication {
    int id;
    String title;
    int editionDate;
    String editorial;
    String authors;
    int ISBN;
    boolean readed;
    int timeReaded;

    public Books(String title, int editionDate, String editorial, int ISBN) {
        super(title, editionDate, editorial);
    }

    // Métodos getter y setter para los atributos (opcional)
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
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public int ISBN() {
        return ISBN;
    }



}