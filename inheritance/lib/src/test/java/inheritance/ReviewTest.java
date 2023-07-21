package inheritance;

import inheritance.Businesses.Restaurant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewTest {

    @Test
    @DisplayName("Add Review Test")
    void addReviewTEST() {

        // Arrange
        Restaurant sut = new Restaurant("steakEaters", "$$$");

        //Act
        Review review1 = new Review("Food tastes like burnt rubber", "Ricky Tanner","", 2.5f);
        sut.addReview(review1);

        Review review2 = new Review("Wow oh WOW!", "Suzie Ann","", 3.5f);
        sut.addReview(review2);

        Review review3 = new Review("Best leftovers I can throw up", "Rick Steel","", 2.5f);
        sut.addReview(review3);

        // Assert
        assertEquals("Ricky Tanner", review1.getAuthor());
        assertEquals("Suzie Ann", review2.getAuthor());
        assertEquals("Rick Steel", review3.getAuthor());
        assertEquals(2.8333f, sut.getAvgStarRating(), 0.0001f);

        System.out.println("Reviews:");
        for (Review review : sut.getReviews()) {
            System.out.println(review);
        }
        System.out.println("Average Star Rating: " + sut.getAvgStarRating());
    }
}