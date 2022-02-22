package controller;

import model.PReceipt;

/**
 * Inspired by the book: Flexible, Reliable Software
 * Henrik B�rbak Christensen: Flexible, Reliable Software. Taylor and Francis Group, LLC 2010
 */

public class ControlReceipt {
	
	private PReceipt buyReceipt = null;

	public ControlReceipt(int value) {
		buyReceipt = new PReceipt(value);
	}
  
	public int getParkingTicketValue() {
		return buyReceipt.getValue();
	}

	public PReceipt getParkingReceipt() {
		return buyReceipt;
	}

}
