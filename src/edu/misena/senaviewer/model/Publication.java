package edu.misena.senaviewer.model;

import java.util.Date;

public class Publication {
    String title;
    int editionDate;
    String editorial;
    String authors;


    public Publication(String title, int  editionDate, String editorial) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEdititionDate() {
        return editionDate;
    }

    public void setEdititionDate(int  edititionDate) {
        this.editionDate = edititionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
