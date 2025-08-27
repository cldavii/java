package secao06;

import java.util.Locale;
import java.util.Scanner;

public class PasswordVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String password = "2002";
        String tryPassword = scanner.next();
        while (!tryPassword.equals(password)) {
            System.out.println("Senha Invalida");
            tryPassword = scanner.next();
        }
        System.out.println("Acesso Permitido");
        scanner.close();
    }
}
