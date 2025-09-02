package secao10;

import java.util.Locale;
import java.util.Scanner;

public class SumVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantos numeros você vai digitar? ");
        byte n = scanner.nextByte();

        float[] numbers = new float[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite o número: ");
            numbers[i] = scanner.nextFloat();
        }
        System.out.print("\nVALORES = ");
        for (float number : numbers) {
            System.out.print(number + " ");
        }
        System.out.print("\nSOMA = ");
        float sum = 0;
        for (byte i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.printf("%.2f", sum);
        System.out.print("\nMEDIA = ");
        float average = sum / numbers.length;
        System.out.printf("%.2f", average);

        scanner.close();
    }
}
