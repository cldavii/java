package secao10;

import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        byte n = scanner.nextByte();

        byte[] numbers = new byte[n];
        for (byte i = 0; i < n; i++) {
            System.out.print("Digite o número: ");
            numbers[i] = scanner.nextByte();
        }
        System.out.println("NÚMEROS NEGATIVOS:");
        for (byte negatives : numbers) {
            if (negatives < 0) {
                System.out.println(negatives);
            }
        }
        scanner.close();
    }
}
