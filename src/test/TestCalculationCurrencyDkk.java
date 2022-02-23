package test;

import org.junit.*;
import static org.junit.Assert.*;

import controller.*;
import model.Currency;

/**
 * Inspired by the book: Flexible, Reliable Software Henrik B�rbak Christensen:
 * Flexible, Reliable Software. Taylor and Francis Group, LLC 2010
 */

public class TestCalculationCurrencyDkk {

	ControlPayStation ps;

	/** Fixture for pay station testing. */
	@Before
	public void setUp() {
		ps = new ControlPayStation();
	}



	/**
	 * Entering 50 Øre should make the display report 3 minutes parking time.
	 */
	// logic is ((0.5/7.5)*100)*24 rounded up == 180 sec = 3min
	@Test
	public void shouldDisplay3MinFor50Ore() throws IllegalCoinException {
		
		// Arrange
		int expectedParkingTime = 3;	// In minutes
		int coinValue = 50;
		Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.FRACTION;
		
		// Act
		ps.addPayment(coinValue, coinCurrency, coinType);
			
		// Assert
		assertEquals("Should display 3 min for 50 �re", expectedParkingTime, ps.readDisplay());
	}

	/**
	 * Entering 0 DKK should throw IllegalCoinException
	 */
	@Test(expected = IllegalCoinException.class)
	public void shouldDisplayIllegalCoinExceptionFor0dkk() throws IllegalCoinException {
		
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
	 * Entering 5 DKK should make the display report 27 minutes parking time. 
	 */
	@Test
	public void shouldDisplay27minFor5dkk() throws IllegalCoinException {
		
		// Arrange
		int expectedParkingTime = 27;
		int coinValue = 5;
		Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.INTEGER;
		
		// Act
		ps.addPayment(coinValue, coinCurrency, coinType);
			
		// Assert
		assertEquals(expectedParkingTime, ps.readDisplay());
	}

	/**
	 * Entering 5 DKK should make the display report 27 minutes parking time. 
	 */
	@Test
	public void shouldDisplay14minFor2dkk50Ore() throws IllegalCoinException {
		
		// Arrange
		int expectedParkingTime = 14;
		int coinValueDKK = 2;
		Currency.ValidCurrency coinCurrencyDKK = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinTypeDKK = Currency.ValidCoinType.INTEGER;
		
		int coinValueORE = 50;
		Currency.ValidCurrency coinCurrencyORE = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinTypeORE = Currency.ValidCoinType.FRACTION;
		
		// Act
		ps.addPayment(coinValueDKK, coinCurrencyDKK, coinTypeDKK);
		ps.addPayment(coinValueORE, coinCurrencyORE, coinTypeORE);
			
		// Assert
		assertEquals(expectedParkingTime, ps.readDisplay());
	}

	/**
	 * Entering 5 DKK should make the display report 27 minutes parking time. 
	 */
	@Test
	public void shouldDisplay2667minFor500DKK() throws IllegalCoinException {
		
		// Arrange
		int expectedParkingTime = 2667;
		int coinValue = 10;
		int multiplier = 50;
		Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.INTEGER;
		
		// Act
		for(int i = 0; i < multiplier; i++) {
			ps.addPayment(coinValue, coinCurrency, coinType);
		}
			
		// Assert
		assertEquals(expectedParkingTime, ps.readDisplay());
	}


	/** Fixture for pay station testing. */
	@After
	public void cleanUp() {
		ps.setReady();
	}	
	
}
