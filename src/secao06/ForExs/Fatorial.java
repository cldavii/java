package secao06.ForExs;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = scanner.nextByte();
        int fatorial = 1;
        for (byte i = n; i >= 1; i--) {
            fatorial *= i;
        }
        System.out.println(fatorial);
        scanner.close();
    }
}
