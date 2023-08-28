package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double finalPriceCalculator(double dollarPrice, double buyQty) {
		double rawPrice = dollarPrice * buyQty;
		return rawPrice + (rawPrice * IOF);
		
	}
}
