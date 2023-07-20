package inheritance;

import inheritance.Businesses.Restaurant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheaterTest {
    @Test
    @DisplayName("Instantiate/Create a New Instance of Restaurant")
    void createNewRestaurantTEST() {
        //Arrange
        Restaurant sut = new Restaurant("Wild Steaks", "$");
        //Act
        //Assert
        assertEquals(sut.getClass(), Restaurant.class);
        assertEquals("Wild Steaks", sut.getName());

        //Print for Visual
        System.out.println(sut);
        System.out.println("The Restaurant name is: "+sut.getName());

    }
}