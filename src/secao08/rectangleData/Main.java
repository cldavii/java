package secao08.rectangleData;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Rectangle rectangle = new Rectangle();

        System.out.print("Enter the rectangle width: ");
        rectangle.width = scanner.nextDouble();
        System.out.print("Enter the rectangle height: ");
        rectangle.height = scanner.nextDouble();

        System.out.println("Area = " + rectangle.area());
        System.out.println("Area = " + rectangle.perimeter());
        System.out.println("Area = " + rectangle.diagonal());

        scanner.close();
    }
}
