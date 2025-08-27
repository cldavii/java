package secao06.ForExs;

import java.util.Locale;
import java.util.Scanner;

public class WeightedAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        byte n = scanner.nextByte();
        float a, b, c;
        float average;
        for (int i = 0; i < n; i++) {
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();
            average = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5);
            System.out.printf("%.1f%n", average);
        }
        scanner.close();
    }
}
