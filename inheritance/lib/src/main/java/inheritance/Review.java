package inheritance;

import inheritance.Businesses.Restaurant;

public class Review {
    // Properties
    private String body;
    private String author;
    public float stars;


    // ***Constructors*** //

    public Review() {
    }


    public Review(String body, String author, float stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
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
