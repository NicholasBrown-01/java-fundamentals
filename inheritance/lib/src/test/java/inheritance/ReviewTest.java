package inheritance;

import inheritance.Businesses.Restaurant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewTest {

    @Test
    @DisplayName("Add Review Test")
    void addReviewTEST() {
        // Arrange and Act
        Restaurant steakEaters = new Restaurant("steakEaters", "$$$");
        Review review = new Review("Food tastes like burnt rubber", "Ricky Tanner", 1.5f, steakEaters);
        steakEaters.addReview(review);
        // Assert
        assertEquals("Ricky Tanner", review.getAuthor());
        System.out.println(steakEaters.getReviews());
        System.out.println(steakEaters);

    }

    @Test
    @DisplayName("Star Rating Test")
    void starRatingTEST() {
        // Arrange and Act
        Restaurant steakEaters = new Restaurant("steakEaters", "$");
        Review review1 = new Review("Food tastes like burnt rubber", "Ricky Tanner", 1.5f, steakEaters);
        steakEaters.addReview(review1);

        Review review2 = new Review("Wow oh WOW!", "Suzie Ann", 4.5f, steakEaters);
        steakEaters.addReview(review2);

        Review review3 = new Review("Best leftovers I can throw up", "Rick Steel", 3.5f, steakEaters);
        steakEaters.addReview(review3);


        // Assert
        assertEquals("Ricky Tanner", review1.getAuthor());
        assertEquals("Suzie Ann", review2.getAuthor());
        assertEquals("Rick Steel", review3.getAuthor());
        assertEquals(3.1667f, steakEaters.getAvgStarRating(), 0.0001f);

        System.out.println("Reviews");
        for (Review review : steakEaters.getReviews()) {
            System.out.println(review);
        }
        System.out.println("Average Star Rating: "+steakEaters.getAvgStarRating());

    }
}