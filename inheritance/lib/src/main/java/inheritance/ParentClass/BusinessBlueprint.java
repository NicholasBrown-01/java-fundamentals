package inheritance.ParentClass;
import inheritance.Review;
import java.util.ArrayList;

public class BusinessBlueprint {

    // ***Properties*** // What it CAN have to pass down:
    public String name;
    public ArrayList<Review> reviews = new ArrayList<>();
    public float starRating;
    public int totalStarReviews;
    public float avgStarRating;
    public String priceCategory;

    // ***CONSTRUCTORS*** // What it could possibly need to track and process so the children also have access to it.
public BusinessBlueprint() {
}

    public BusinessBlueprint
            (String name, String priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
        this.starRating = 0;
        this.totalStarReviews = 0;
        this.avgStarRating = 0;
    }

    public Review addReview(Review review) {
        this.reviews.add(review);
        this.starRating += review.stars;
        this.totalStarReviews++;
        this.avgStarRating = (float) starRating / totalStarReviews;
        return review;
    }

    // ***GETTERS AND SETTERS*** //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public float getStarRating() {
        return starRating;
    }

    public void setStarRating(float starRating) {
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

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    @Override
    public String toString() {
        return "BusinessBlueprint{" +
                "name='" + name + '\'' +
                ", reviews=" + reviews +
                ", starRating=" + starRating +
                ", totalStarReviews=" + totalStarReviews +
                ", avgStarRating=" + avgStarRating +
                ", priceCategory='" + priceCategory + '\'' +
                '}';
    }
}

