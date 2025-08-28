package secao08.dollarConversion;

public class CurrencyConverter {
    public static final double tax = 0.06;
    public double dollarPrice;
    public double dollarsPurchased;

    public double conversor() {
        double totalDollars = dollarPrice * dollarsPurchased;
        return totalDollars + totalDollars * tax;
    }
}
