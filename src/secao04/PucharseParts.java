package secao04;

import java.util.Locale;
import java.util.Scanner;

public class PucharseParts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        short piece1 = scanner.nextShort();
        byte amountPiece1 = scanner.nextByte();
        float unitaryPricePiece1 = scanner.nextFloat();
        float totalPricePiece1 = amountPiece1 * unitaryPricePiece1;
        short piece2 = scanner.nextShort();
        byte amountPiece2 = scanner.nextByte();
        float unitaryPricePiece2 = scanner.nextFloat();
        float totalPricePiece2 = amountPiece2 * unitaryPricePiece2;
        float total = totalPricePiece1 + totalPricePiece2;
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));
    }
}
