package secao05;

import java.util.Locale;
import java.util.Scanner;

public class IncomeTaxCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        float salary = scanner.nextFloat();
        double tax;
        if (salary <= 2000) {
            tax = 0;
        } else if (salary <= 3000) {
            tax = (salary - 2000) * 0.8;
        } else if (salary <= 4500) {
            tax = (salary - 3000) * 0.18 + (1000 * 0.08);
        } else {
            tax = (salary - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08);
        }
        if (tax == 0) {
            System.out.println("Isento");
        } else {
            System.out.println("R$ " + String.format("%.2f", tax));
        }
        scanner.close();
    }
}
