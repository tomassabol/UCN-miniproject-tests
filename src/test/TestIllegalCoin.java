package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import controller.*;
import model.Currency;

/**
 * Inspired by the book: Flexible, Reliable Software Henrik B�rbak Christensen:
 * Flexible, Reliable Software. Taylor and Francis Group, LLC 2010
 */

public class TestIllegalCoin {

	ControlPayStation ps;

	/** Fixture for pay station testing. */
	@Before
	public void setUp() {
		ps = new ControlPayStation();
	}

	/**
	 * Verify that illegal coins are rejected.
	 */
	
	// Norwegian coin
	@Test(expected = IllegalCoinException.class)
	public void shouldRejectIllegalCurrencyNokCoin() throws IllegalCoinException {
		//Arrange
		int coinValue = 1;
		
		Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.NOK;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.INTEGER;
		//Act
		ps.addPayment(coinValue, coinCurrency, coinType);
		
		//Assert
		assertEquals(IllegalCoinException.class, ps.readDisplay());
	}
	// unknown Euro coin value
	@Test
	public void shouldRejectIllegalEuroCoin() throws IllegalCoinException {
		//Arrange
		int coinValue = 3;
		boolean found = false;
		
		Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.INTEGER;
		
		//Act
		try {
			ps.addPayment(coinValue, coinCurrency, coinType);
			assertFalse(found);
		}catch(IllegalCoinException e) {
			found = true;
			assertTrue(found);
		}
		
		//Assert
		
	}
	
	
	// unknown Euro coin value
	@Test(expected = IllegalCoinException.class)
	public void shouldRejectIllegalEuroCoinPartTwo() throws IllegalCoinException {
		//Arrange
		int coinValue = 3;
		
		Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.INTEGER;
		//Act
		ps.addPayment(coinValue, coinCurrency, coinType);
		
		//Assert
		assertEquals(IllegalCoinException.class, ps.readDisplay());
	}
	
	// unknown Euro coin value
	@Test
	public void shouldNotRejectEuroCoin() throws IllegalCoinException {
		//Arrange
		int coinValue = 2;
		
		Currency.ValidCurrency coinCurrency = Currency.ValidCurrency.EURO;
		Currency.ValidCoinType coinType = Currency.ValidCoinType.INTEGER;
		//Act
		ps.addPayment(coinValue, coinCurrency, coinType);
		
		//Assert
		assertEquals(coinValue, ps.readDisplay());
	}
}
