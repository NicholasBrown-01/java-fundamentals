package inheritance;

import inheritance.Businesses.Restaurant;
import inheritance.Businesses.Shop;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTest {
    @Test
    @DisplayName("Create New Instance of Shop")
    void createNewShopTEST() {

        //Arrange
        Shop sut = new Shop("Gift Store Galore", "Cups, Magnets, and Tshirts", "$$");

        //Act
        Review review1 = new Review("So much stuff I got Lost", "Jen Ableton","", 5.0f);
        sut.addReview(review1);
        Review review2 = new Review("They charged me to look at their mugs!!", "Jerid Dryer","", 1.0f);
        sut.addReview(review2);
        Review review3 = new Review("I got a gift card for a gift card!", "Heather Lonestar","", 4.5f);
        sut.addReview(review3);

        //Assert
        assertEquals(sut.getClass(), Shop.class);
        assertEquals("Gift Store Galore", sut.getName());

        //Print for Visual
        System.out.println("Shop Array Contains: "+sut);
        System.out.println("The Shop name is: "+sut.getName());
        System.out.println("Reviews:");
        for (Review review : sut.getReviews()) {
            System.out.println(review);
        }
        System.out.println("Average Star Rating: "+sut.getAvgStarRating());

    }
}