package controller;

import database.DatabaseLayerException;
import database.IDbPPrice;
import database.DatabasePPrice;
import model.PPrice;

public class ControlPrice {
	
	private IDbPPrice dbPrice;
	
	public ControlPrice() {
		this.dbPrice = new DatabasePPrice();
	}
	
	public PPrice getCurrentPrice() {
		
		PPrice currentPrice = new PPrice(); //hardcoded
		
		return currentPrice;
	}
	
	public PPrice getPriceRemote(int zoneId) throws DatabaseLayerException {
		
		// Get price from Parkingsystem DB
		PPrice readPrice = dbPrice.getPriceByZoneId(zoneId);
		//
		return readPrice;
	}

}
