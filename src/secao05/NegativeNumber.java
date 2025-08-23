package secao05;

import java.util.Locale;
import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        byte number = scanner.nextByte();
        if (number < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }
        scanner.close();
    }
}
