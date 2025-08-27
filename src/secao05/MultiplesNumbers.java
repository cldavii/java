package secao05;

import java.util.Scanner;

public class MultiplesNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte number1 = scanner.nextByte();
        byte number2 = scanner.nextByte();
        byte higherNumber, lowerNumber;
        if (number1 > number2) {
            higherNumber = number1;
            lowerNumber = number2;
        } else {
            higherNumber = number2;
            lowerNumber = number1;
        }
        // Um número é considerado múltiplo de outro quando o resto da divisão entre eles for 0.
        if (higherNumber % lowerNumber == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        scanner.close();
    }
}
