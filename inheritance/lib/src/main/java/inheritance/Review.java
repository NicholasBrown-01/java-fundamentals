package inheritance;

import inheritance.Businesses.Restaurant;

public class Review {
    // Properties
    private String body;
    private String author;
    private String movieWatched;
    public float stars;


    // ***Constructors*** //

    public Review() {
    }


    public Review(String body, String author, String movieWatched, float stars) {
        this.body = body;
        this.author = author;
        this.movieWatched = movieWatched;
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

    public String getMovieWatched() {
        return movieWatched;
    }

    public void setMovieWatched(String movieWatched) {
        this.movieWatched = movieWatched;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", movieWatched='" + movieWatched + '\'' +
                ", stars=" + stars +
                '}';
    }
}

