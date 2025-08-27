package secao08.rectangleData;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the rectangle width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the rectangle height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Area = " + rectangle.area());
        System.out.println("Area = " + rectangle.perimeter());
        System.out.println("Area = " + rectangle.diagonal());

        scanner.close();
    }
}
