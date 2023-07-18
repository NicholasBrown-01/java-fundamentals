package inheritance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {
    @Test
    @DisplayName("Instantiate a New Restaurant")
    void createNewRestaurantTEST() {
        //Arrange
        Restaurant sut = new Restaurant("Testing Name", true, 7, 25);
        //Act


        //Assert
        assertEquals(sut.getClass(), Restaurant.class);
        assertEquals("Testing Name", sut.getName());
        assertEquals(7, sut.getMenuItems());

        //Print for Visual
        System.out.println(sut);
        System.out.println(sut.getName());
        System.out.println(sut.getMenuItems());

    }

    @Nested
    class ReviewTest {
        @Test
        @DisplayName("Add Review Test")
        void addReviewTEST() {
            // Arrange and Act
            Restaurant steakEaters = new Restaurant("steakEaters", true, 7, 25);
            Review sut = new Review("Food tastes like burnt rubber", "Ricky Tanner", 1.5f, steakEaters );
            // Assert
            assertEquals("Ricky Tanner", sut.getAuthor());
            System.out.println(sut);
        }
    }
}