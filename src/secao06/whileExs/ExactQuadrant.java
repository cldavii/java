package secao06.whileExs;

import java.util.Locale;
import java.util.Scanner;

public class ExactQuadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        byte x, y;
        x = scanner.nextByte();
        y = scanner.nextByte();
        while (x != 0 || y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
                x = scanner.nextByte();
                y = scanner.nextByte();
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
                x = scanner.nextByte();
                y = scanner.nextByte();
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
                x = scanner.nextByte();
                y = scanner.nextByte();
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
                x = scanner.nextByte();
                y = scanner.nextByte();
            } else {
                break;
            }
        }
        scanner.close();
    }
}
