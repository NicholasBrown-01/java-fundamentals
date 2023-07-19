package inheritance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {
    @Test
    @DisplayName("Instantiate a New Restaurant")
    void createNewRestaurantTEST() {
        //Arrange
        Restaurant sut = new Restaurant("Testing Name", '$');
        //Act
        //Assert
        assertEquals(sut.getClass(), Restaurant.class);
        assertEquals("Testing Name", sut.getName());

        //Print for Visual
        System.out.println(sut);
        System.out.println(sut.getName());

    }
}