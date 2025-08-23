package secao04;

import java.util.Locale;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        float radius = scanner.nextFloat();
        double pi = 3.14159;
        double area = pi * Math.pow(radius, 2);
        System.out.println("A = " + String.format("%.4f", area));

        scanner.close();
    }
}
