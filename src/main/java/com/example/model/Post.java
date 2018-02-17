package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Post implements Serializable {

    @Id
    private String id;
    private String title;
    private String description;
    private String image;
    private int shares;

    private Author author;

    public Post() {
    }

    public Post(String title, String description, String image, int shares, Author author) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.shares = shares;
        this.author = author;
    }
    public Post(String id, String title, String description, String image, int shares, Author author) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.shares = shares;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", shares=" + shares +
                ", author=" + author +
                '}';
    }
}
