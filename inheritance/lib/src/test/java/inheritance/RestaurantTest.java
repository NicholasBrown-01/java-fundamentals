package inheritance;

import inheritance.Businesses.Restaurant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {
    @Test
    @DisplayName("Create New Instance of Restaurant")
    void createNewRestaurantTEST() {
        //Arrange
        Restaurant sut = new Restaurant("Wild Steaks", "$");

        //Act
        Review review1 = new Review("Food tastes like burnt rubber", "Ricky Tanner", 1.5f);
        sut.addReview(review1);
        Review review2 = new Review("Great value meal!!!!", "Susie Que", 5.0f);
        sut.addReview(review2);
        Review review3 = new Review("It was meh, but better than nuggets.", "Joy Doey", 3.5f);
        sut.addReview(review3);

        //Assert
        assertEquals(Restaurant.class, sut.getClass());
        assertEquals("Wild Steaks", sut.getName());

        //Print for Visual
        System.out.println("Restaurant Array Contains: "+sut);
        System.out.println("Restaurant name: "+sut.getName());

        System.out.println("Reviews:");
        for (Review review : sut.getReviews()) {
            System.out.println(review);
        }

        System.out.println("Average Star Rating: "+sut.getAvgStarRating());

    }
}