package secao06.ForExs;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short x = scanner.nextShort();
        if (x < 1 || x > 1000) {
            System.out.println("Invalid number");
        }
        for (int i = 0; i < x; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
