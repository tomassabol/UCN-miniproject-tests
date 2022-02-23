package test;

import org.junit.*;
import static org.junit.Assert.*;

import controller.*;
import model.*;
import model.Currency.ValidCoinType;
import model.Currency.ValidCurrency;

/**
 * Inspired by the book: Flexible, Reliable Software Henrik B�rbak Christensen:
 * Flexible, Reliable Software. Taylor and Francis Group, LLC 2010
 */

public class TestReset {

	ControlPayStation ps;

	/** Fixture for pay station testing. */
	@Before
	public void setUp() {
		ps = new ControlPayStation();
	}

	/**
	 * Verify that the pay station is cleared and display shows 0 after a buy scenario
	 */
	@Test
	public void shouldClearAfterBuy() throws IllegalCoinException, Exception {
		// Arrange
		int coinValue = 1;
		Currency.ValidCurrency currency = ValidCurrency.EURO;
		Currency.ValidCoinType coinType = ValidCoinType.FRACTION;

		// Act
		ps.addPayment(coinValue, currency, coinType);
		PReceipt receipt = ps.buy();

		// Assert
		assertEquals(ps.readDisplay(), 0);
	}

	/**
	 * Verify that cancel() clears the pay station
	 */
	@Test
	public void shouldClearAfterCancel() throws IllegalCoinException {
		// Arrange
		int coinValue = 1;
		Currency.ValidCurrency currency = ValidCurrency.EURO;
		Currency.ValidCoinType coinType = ValidCoinType.FRACTION;

		// Act
		ps.addPayment(coinValue, currency, coinType);
		ps.cancel();

		// Assert
		assertEquals(ps.readDisplay(), 0);
	}
}
