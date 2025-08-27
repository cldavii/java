package secao06.ForExs;

import java.util.Scanner;

public class PairDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = scanner.nextByte();
        for (int i = 1; i <= n; i++) {
            byte numerator = scanner.nextByte();
            byte denominator = scanner.nextByte();
            if (denominator == 0) {
                System.out.println("divisao impossivel");
            } else {
                double division = (double) numerator / denominator;
                System.out.println(division);
            }
        }
        scanner.close();
    }
}
