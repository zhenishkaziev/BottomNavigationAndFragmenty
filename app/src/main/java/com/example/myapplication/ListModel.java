package com.example.myapplication;

public class ListModel {

     String title, description;
     int image;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    public ListModel(String title, int image, String description) {
        this.title = title;
        this.description = description;
        this.image = image;
    }
}
