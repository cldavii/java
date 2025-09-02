package secao10;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        byte[] numbers = new byte[scanner.nextByte()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite o número: ");
            numbers[i] = scanner.nextByte();
        }
        byte counter = 0;
        System.out.println("NUMEROS PARES:");
        for (byte number : numbers) {
            if (number % 2 == 0) {
                counter++;
                System.out.printf(number + " ");
            }
        }
        System.out.println("\n\nQUANTIDADE DE PARES = " + counter);
        scanner.close();
    }
}
