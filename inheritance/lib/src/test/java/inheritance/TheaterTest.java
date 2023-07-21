package inheritance;


import inheritance.Businesses.Theater;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheaterTest {
    @Test
    @DisplayName("Create New Instance of Theater")
    void createTheaterTEST() {

        //Arrange
        Theater sut = new Theater("viewMax Theater", "$$$");

        //Act
        Review review1 = new Review("Sticky floors so bad I lost my shoes...then socks!", "James Delight", 1.0f);
        sut.addReview(review1);
        Review review2 = new Review("Snap Crackle Pop that was fun!!!", "Adam John", 4.0f);
        sut.addReview(review2);
        Review review3 = new Review("I went in blind and came out deaf too! Great sound!!", "Dave Lasseter", 4.5f);
        sut.addReview(review3);

        //Assert
        assertEquals(Theater.class, sut.getClass());
        assertEquals("viewMax Theater", sut.getName());

        //Print for Visual
        System.out.println("Theater Array Contains: "+sut);
        System.out.println("The Theater name is: "+sut.getName());
        System.out.println("Reviews:");
        for (Review review : sut.getReviews()) {
            System.out.println(review);
        }
        System.out.println("Average Star Rating: "+sut.getAvgStarRating());

    }
}