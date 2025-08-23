package secao04;

import java.util.Locale;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        byte value1 = scanner.nextByte();
        byte value2 = scanner.nextByte();
        int sum = value1 + value2;
        System.out.println("SOMA = " + sum);

        scanner.close();
    }
}
