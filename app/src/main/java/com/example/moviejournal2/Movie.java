package com.example.moviejournal2;


public class Movie {

    public String title;
    public String id;
    public Integer year;
    public String genre;
    public String imageUrl;

    public Movie(String id, String title, Integer year, String genre, String imageUrl) {

        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {return title;}
    public String getID() {return id;}
    public Integer getYear() {return year;}
    public String getGenre() {return genre;}
    public String getImageUrl() {return imageUrl;}

}
