package test;

import org.junit.*;
import static org.junit.Assert.*;

import controller.*;
import model.*;

public class TestBoundaryCalculationCurrencyDKK {
    ControlPayStation ps;

    @Before
    public void setUp() {
        ps = new ControlPayStation();
    }


    /////////////////////////////////////////////////////
    //              tests for øre coins              //
    ///////////////////////////////////////////////////


    /**
     * test for entering 49 øre coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test49ore() throws IllegalCoinException {

        // Arrange
        int coinValue = 49;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.FRACTION;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 51 øre coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test51ore() throws IllegalCoinException {

        // Arrange
        int coinValue = 51;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.FRACTION;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }
    

    /////////////////////////////////////////////////////
    //              tests for DKK coins              //
    ///////////////////////////////////////////////////


    /**
     * test for entering 0 dkk coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test0dkk() throws IllegalCoinException {

        // Arrange
        int coinValue = 0;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.INTEGER;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 3 dkk coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test3dkk() throws IllegalCoinException {

        // Arrange
        int coinValue = 3;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.INTEGER;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 4 dkk coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test4dkk() throws IllegalCoinException {

        // Arrange
        int coinValue = 4;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.INTEGER;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 6 dkk coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test6dkk() throws IllegalCoinException {

        // Arrange
        int coinValue = 6;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.INTEGER;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 9 dkk coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test9dkk() throws IllegalCoinException {

        // Arrange
        int coinValue = 9;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.INTEGER;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 11 dkk coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test11dkk() throws IllegalCoinException {

        // Arrange
        int coinValue = 11;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.INTEGER;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 19 dkk coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test19dkk() throws IllegalCoinException {

        // Arrange
        int coinValue = 19;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.INTEGER;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 21 dkk coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test21dkk() throws IllegalCoinException {

        // Arrange
        int coinValue = 21;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.INTEGER;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }
}
