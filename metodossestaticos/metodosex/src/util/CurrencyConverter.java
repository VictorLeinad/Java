package util;

public class CurrencyConverter {
	
	public static double PORCEM() {
		return 0.06;
	}
	
	public static double dolar(double valor, double compra) {
		return valor * compra * (1.0 	+ PORCEM());
	}
	
}
