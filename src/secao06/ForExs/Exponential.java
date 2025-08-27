package secao06.ForExs;

import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = scanner.nextByte();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + (int)Math.pow(i, 2) + " " + (int)Math.pow(i, 3));
        }
        scanner.close();
    }
}
