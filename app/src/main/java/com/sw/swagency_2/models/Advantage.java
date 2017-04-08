package com.sw.swagency_2.models;

/**
 * Created by Odinn on 01.04.2017.
 */

public class Advantage {
    private String title;
    private int img;


    public Advantage(String title, int   img) {
        this.title = title;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public int getImg() {
        return img;
    }
}
