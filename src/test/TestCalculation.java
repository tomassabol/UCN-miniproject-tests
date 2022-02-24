package test;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Assert.*;

import model.*;
import controller.*;

public class TestCalculation {
 
    PPayStation ps;
    Calculation calculation;
    Coin coin;

    @Before
    public void setUp() throws Exception {
        ps = new PPayStation(0, "test-model");
        calculation = new Calculation(ps);
        coin = new Coin(0, Currency.ValidCurrency.EURO, Currency.ValidCoinType.FRACTION);
    }

    @Test
    public void amount1expected1min() {
        // Arrange
        int expected = 1;

        // Act
        ps.setAmount(1);

        // Assert
        assertEquals(expected, calculation.getTimeBoughtInMinutes());
    }

    @Test
    public void amount100expect40() {
        // Arrange
        int expected = 40;

        // Act
        ps.setAmount(100);

        // Assert
        assertEquals(expected, calculation.getTimeBoughtInMinutes());
    }


    @After
    public void zero() throws Exception {
        ps = null;
        calculation = null;
        coin = null;
    }

}
