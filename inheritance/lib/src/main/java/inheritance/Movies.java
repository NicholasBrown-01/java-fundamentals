package inheritance;

import inheritance.Businesses.Restaurant;

public class Movies {
    // Properties
    private String title;
    private String author;
    public float stars;
    public Restaurant restaurant;

    //Constructor

    public Movies(){
    }

    public Movies(String body, String author, float stars, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.restaurant = restaurant;
    }

    // Getters and Setters

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                '}';
    }
}
