package secao08.dollarConversion;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.print("What is the dollars price: ");
        converter.dollarPrice = scanner.nextDouble();
        System.out.print("How many dollars will be purchased: ");
        converter.dollarsPurchased = scanner.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f%n", converter.conversor());

        scanner.close();
    }
}
