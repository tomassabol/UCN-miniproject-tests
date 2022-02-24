package test;

import org.junit.*;
import static org.junit.Assert.*;

import controller.*;
import model.*;

public class TestGetCurrentPrice {
    
    ControlPrice cp;
    PPrice pPrice;

    @Before
    public void setUp() {
        cp = new ControlPrice();
        pPrice = new PPrice();
    }

    @Test
    public void testCurrentPrice() {
        // Arrange
        int expectedPrice = 24;

        // Act
        int currentPrice = pPrice.getParkingPrice();
        
        // Assert
        assertEquals(expectedPrice, currentPrice);
    }
}
