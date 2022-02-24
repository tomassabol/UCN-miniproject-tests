package model;

public class Coin {

	private int amount; 
	private Currency.ValidCurrency currency;
	private Currency.ValidCoinType coinType;

	private Currency.InvalidCurrency invalidCurrency;

	
	public Coin(int amount, Currency.ValidCurrency currency, Currency.ValidCoinType coinType) {
		this.amount = amount;
		this.currency = currency;
		this.coinType = coinType;
	}

	public Coin(int amount, Currency.InvalidCurrency currency, Currency.ValidCoinType coinType) {
		this.amount = amount;
		this.invalidCurrency = currency;
		this.coinType = coinType;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Currency.ValidCurrency getCurrency(){
		return currency;
	}
	
	public void setCurrency(Currency.ValidCurrency currency){
		this.currency = currency;
	}
	
	public Currency.ValidCoinType getCoinType() {
		return coinType;
	}
	
	public void setCoinType(Currency.ValidCoinType coinType) {
		this.coinType = coinType;
	}
}
