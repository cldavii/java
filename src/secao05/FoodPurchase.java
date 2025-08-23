package secao05;

import java.util.Locale;
import java.util.Scanner;

public class FoodPurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        byte itemCode = scanner.nextByte();
        byte itemAmount = scanner.nextByte();
        float totalPrice = 0;
        if (itemCode == 1) {
            totalPrice = itemAmount * 4f;
        } else if (itemCode == 2) {
            totalPrice = itemAmount * 4.50f;
        } else if (itemCode == 3) {
            totalPrice = itemAmount * 5f;
        } else if (itemCode == 4) {
            totalPrice = itemAmount * 2f;
        } else if (itemCode == 5) {
            totalPrice = itemAmount * 1.50f;
        }
        System.out.println("Total: R$" + String.format("%.2f", totalPrice));
        scanner.close();
    }
}
