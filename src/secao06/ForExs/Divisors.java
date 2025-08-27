package secao06.ForExs;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte number = scanner.nextByte();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
