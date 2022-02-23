package test;

import org.junit.*;
import static org.junit.Assert.*;

import model.*;
import controller.*;

public class TestBoundaryCalculationCurrencyEuro {
    private ControlPayStation ps;

    @Before
    public void setUp() {
        ps = new ControlPayStation();
    }


    /////////////////////////////////////////////////////
    //              tests for cent coins              //
    ///////////////////////////////////////////////////

    /**
     * test for entering 0 cent coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test0cents() throws IllegalCoinException {

        // Arrange
        int coinValue = 0;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.FRACTION;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 3 cent coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test3cents() throws IllegalCoinException {

        // Arrange
        int coinValue = 3;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.FRACTION;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 4 cent coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test4cents() throws IllegalCoinException {

        // Arrange
        int coinValue = 4;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.FRACTION;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 6 cent coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test6cents() throws IllegalCoinException {

        // Arrange
        int coinValue = 6;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.FRACTION;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 9 cent coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test9cents() throws IllegalCoinException {

        // Arrange
        int coinValue = 9;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.FRACTION;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 11 cent coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test11cents() throws IllegalCoinException {

        // Arrange
        int coinValue = 11;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.FRACTION;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 19 cent coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test19cents() throws IllegalCoinException {

        // Arrange
        int coinValue = 19;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.FRACTION;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 21 cent coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test21cents() throws IllegalCoinException {

        // Arrange
        int coinValue = 21;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.FRACTION;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 49 cent coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test49cents() throws IllegalCoinException {

        // Arrange
        int coinValue = 49;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.FRACTION;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 51 cent coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test51cents() throws IllegalCoinException {

        // Arrange
        int coinValue = 51;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.FRACTION;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 99 cent coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test99cents() throws IllegalCoinException {

        // Arrange
        int coinValue = 99;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.FRACTION;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /////////////////////////////////////////////////////
    //              tests for cent coins              //
    ///////////////////////////////////////////////////

    /**
     * test for entering 0 euro coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test0euros() throws IllegalCoinException {

        // Arrange
        int coinValue = 0;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.INTEGER;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

    /**
     * test for entering 3 cent coin, which is invalid
     * @throws IllegalCoinException - expected result
     */
    @Test(expected = IllegalCoinException.class)
    public void test3euros() throws IllegalCoinException {

        // Arrange
        int coinValue = 3;

        Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.FRACTION;
        
        // Act
        ps.addPayment(coinValue, coinCurrency, coinType);

        // Assert
        assertEquals(IllegalCoinException.class, ps.readDisplay());

    }

}
