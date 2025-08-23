package secao04;

import java.util.Locale;
import java.util.Scanner;

public class FiguresArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        float a, b, c;
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        float triangleArea = (a * c) / 2;
        double circleArea = Math.PI * Math.pow(c, 2);
        float trapeziusArea = ((a + b) * c) / 2;
        double squareArea = Math.pow(b, 2);
        float rectangleArea = a * b;

        System.out.println("TRIANGULO: " + String.format("%.3f", triangleArea));
        System.out.println("CIRCULO: " + String.format("%.3f", circleArea));
        System.out.println("TRAPEZIO: " + String.format("%.3f", trapeziusArea));
        System.out.println("QUADRADO: " + String.format("%.3f", squareArea));
        System.out.println("RETANGULO: " + String.format("%.3f", rectangleArea));

        scanner.close();
    }
}
