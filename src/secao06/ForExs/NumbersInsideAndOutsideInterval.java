package secao06.ForExs;

import java.util.Locale;
import java.util.Scanner;

public class WeightedAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        byte n = scanner.nextByte();
        byte x;
        byte inCounter = 0;
        byte outCounter = 0;
        for (int i = 0; i < n; i++) {
            x = scanner.nextByte();
            if (x >= 10 && x <= 20) {
                inCounter++;
            } else {
                outCounter++;
            }
        }
        System.out.println(inCounter + " in");
        System.out.println(outCounter + " out");
        scanner.close();
    }
}
