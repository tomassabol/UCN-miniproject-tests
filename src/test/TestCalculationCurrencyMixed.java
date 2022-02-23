package test;

import org.junit.*;
import static org.junit.Assert.*;

import controller.*;
import model.*;

/**
 * Inspired by the book: Flexible, Reliable Software Henrik B�rbak Christensen:
 * Flexible, Reliable Software. Taylor and Francis Group, LLC 2010
 */

public class TestCalculationCurrencyMixed {

	ControlPayStation ps;

	/** Fixture for pay station testing. */
	@Before
	public void setUp() {
		ps = new ControlPayStation();
	}

	/**
	 * Entering 1 cent and 50 ore should make the display report 4 minutes parking time.
	 */
	@Test
	public void shouldDisplay4MinFor1CentAnd50Ore() throws IllegalCoinException {
		// Arrange
		int expectedParkingTime = 4;
		int coinValueCent = 1;
		
		Currency.ValidCurrency coinCurrencyCent = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinTypeCent = Currency.ValidCoinType.FRACTION;
		
		int coinValueOre = 50;
		Currency.ValidCurrency coinCurrencyOre = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinTypeOre = Currency.ValidCoinType.FRACTION;
		
		// Act
		ps.addPayment(coinValueCent, coinCurrencyCent, coinTypeCent);
		ps.addPayment(coinValueOre, coinCurrencyOre, coinTypeOre);
		
		
		// Assert
		assertEquals("Should display 4 minutes for 1 cent and 1 ore", expectedParkingTime, ps.readDisplay());		
	}
	
	/**
	 * Entering 1 EUR and 1 DKK should make the display report 46 minutes parking time.
	 */
	@Test
	public void shouldDisplay46MinFor1EURAnd1DKK() throws IllegalCoinException {
		// Arrange
		int expectedParkingTime = 46;
		int coinValueEUR = 1;
		
		Currency.ValidCurrency coinCurrencyEUR = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinTypeEUR = Currency.ValidCoinType.INTEGER;
		
		int coinValueDKK = 1;
		Currency.ValidCurrency coinCurrencyDKK = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinTypeDKK = Currency.ValidCoinType.INTEGER;
		
		// Act
		ps.addPayment(coinValueEUR, coinCurrencyEUR, coinTypeEUR);
		ps.addPayment(coinValueDKK, coinCurrencyDKK, coinTypeDKK);
		
		
		// Assert
		assertEquals("Should display 4 minutes for 1 cent and 1 ore", expectedParkingTime, ps.readDisplay());		
	}

	/**
	 * Entering 1 EUR and 1 DKK should make the display report 46 minutes parking time.
	 */
	@Test(expected = IllegalCoinException.class)
	public void shouldDisplayIllegalCoinExceptionFor1EURAnd0DKK() throws IllegalCoinException {
		// Arrange
		
		int coinValueEUR = 1;
		Currency.ValidCurrency coinCurrencyEUR = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinTypeEUR = Currency.ValidCoinType.INTEGER;
		
		int coinValueDKK = 0;
		Currency.ValidCurrency coinCurrencyDKK = Currency.ValidCurrency.DKK;
		Currency.ValidCoinType coinTypeDKK = Currency.ValidCoinType.INTEGER;
		
		// Act
		ps.addPayment(coinValueEUR, coinCurrencyEUR, coinTypeEUR);
		ps.addPayment(coinValueDKK, coinCurrencyDKK, coinTypeDKK);
		
		
		// Assert
		assertEquals(IllegalCoinException.class, ps.readDisplay());		
	}
	
	/** Fixture for pay station testing. */
	@After
	public void cleanUp() {
		ps.setReady();
	}
	
}
