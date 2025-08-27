package secao06.whileExs;

import java.util.Locale;
import java.util.Scanner;

public class PasswordVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        short password = 2002;
        short tryPassword = scanner.nextShort();
        while (tryPassword != password) {
            System.out.println("Senha Invalida");
            tryPassword = scanner.nextShort();
        }
        System.out.println("Acesso Permitido");
        scanner.close();
    }
}
