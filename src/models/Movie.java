package models;

import java.util.Date;

public class Movie {
    String id;
    String name;
    int author;
    Date releaseDate;
    Date updatedAt;

    public Movie() {}

    public Movie(String id, String name, int author, Date releaseDate, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.releaseDate = releaseDate;
        this.updatedAt = updatedAt;
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


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", releaseDate=" + releaseDate +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
