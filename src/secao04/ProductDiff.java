package secao04;

import java.util.Locale;
import java.util.Scanner;

public class ProductDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        byte a, b, c, d;
        a = scanner.nextByte();
        b = scanner.nextByte();
        c = scanner.nextByte();
        d = scanner.nextByte();
        int difference = a * b - c * d;
        System.out.println("DIFERENCA: " + difference);

        scanner.close();
    }
}
