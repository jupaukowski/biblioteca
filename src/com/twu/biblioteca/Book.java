package com.twu.biblioteca;

/**
 * Created by jpaukows on 9/24/14.
 */
public class Book{
    private String title = "No Title";
    private String author = "No Author";
    private Integer year = 0;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPropertiesInColumnFormat() {
        return title + " | " + author + " | " + year;
    }
}
