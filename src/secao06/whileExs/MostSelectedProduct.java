package secao06.whileExs;

import java.util.Locale;
import java.util.Scanner;

public class MostSelectedProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        byte fuelType = scanner.nextByte();
        byte amountSelectedAlcool = 0;
        byte amountSelectedGasoline = 0;
        byte amountSelectedDiesel = 0;
        while (fuelType != 4) {
            if (fuelType == 1) {
                amountSelectedAlcool++;
            }
            if (fuelType == 2) {
                amountSelectedGasoline++;
            }
            if (fuelType == 3) {
                amountSelectedDiesel++;
            }
            fuelType = scanner.nextByte();
        }
        System.out.printf("""
                MUITO OBRIGADO
                Alcool: %d
                Gasolina: %d
                Diesel: %d
                %n""", amountSelectedAlcool, amountSelectedGasoline, amountSelectedDiesel);
        scanner.close();
    }
}
