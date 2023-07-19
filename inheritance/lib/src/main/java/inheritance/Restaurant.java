package inheritance;

import java.util.ArrayList;

public class Restaurant {
    //Properties
    private String name;
    public ArrayList<Review> reviews = new ArrayList<>();
    public float starRating;
    public int totalStarReviews;
    public float avgStarRating;

    //Constructor
    public Restaurant() {
    }

    public Restaurant(String name) {
        this.name = name;
        this.reviews = new ArrayList<>();
    }

    public Review addReview(Review review) {
        this.reviews.add(review);
        this.starRating += review.stars;
        this.totalStarReviews++;
        this.avgStarRating = (float) starRating / totalStarReviews;
        return review;
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public int getTotalStarReviews() {
        return totalStarReviews;
    }

    public void setTotalStarReviews(int totalStarReviews) {
        this.totalStarReviews = totalStarReviews;
    }

    public float getAvgStarRating() {
        return avgStarRating;
    }

    public void setAvgStarRating(float avgStarRating) {
        this.avgStarRating = avgStarRating;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", reviews=" + reviews +
                ", starRating=" + starRating +
                ", totalStarReviews=" + totalStarReviews +
                ", avgStarRating=" + avgStarRating +
                '}';
    }
}


