package com.sw.swagency_2.models;

/**
 * Created by Odinn on 01.04.2017.
 */

public class PortfolioItem {
    private String title;
    private String img;
    private String link;
    private String description;

    public PortfolioItem(String link, String img, String title, String description) {
        this.title = title;
        this.img = img;
        this.link = link;
        this.description = description;
    }

    public String getLink() {

        return link;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String getImg() {
        return img;
    }


    public PortfolioItem(String title, String img) {
        this.title = title;
        this.img = img;
    }
}

