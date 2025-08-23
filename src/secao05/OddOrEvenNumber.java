package secao05;

import java.util.Locale;
import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        byte number = scanner.nextByte();
        if (number % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }
        scanner.close();
    }
}
