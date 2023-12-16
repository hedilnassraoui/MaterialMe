package com.example.materialme;

public class Sport {
    private String title;
    private String info;
    private final int imageResource;



    public Sport(String title, String info, int imageResource) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }


    String getTitle() {
        return title;
    }

    public int getImageResource() {
        return imageResource;
    }

    String getInfo() {
        return info;
    }
}
