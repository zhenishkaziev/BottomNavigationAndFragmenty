package com.example.myapplication;

public class HomeModel {

    private String Description;
    private int Image;

    public String getDescription() {
        return Description;
    }

    public int getImage() {
        return Image;
    }

    public HomeModel(String description, int image) {
        Description = description;
        Image = image;
    }
}