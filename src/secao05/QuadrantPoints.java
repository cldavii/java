package secao05;

import java.util.Locale;
import java.util.Scanner;

public class QuadrantPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        float x, y;
        x = scanner.nextFloat();
        y = scanner.nextFloat();
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
        scanner.close();
    }
}
