package models;

import java.util.Date;

public class Movie {
    int id;
    String name;
    int author;
    Date releaseDate;

    public Movie() {}

    public Movie(int id, String name, int author, Date releaseDate) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.releaseDate = releaseDate;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public int getAuthor() {
        return author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
