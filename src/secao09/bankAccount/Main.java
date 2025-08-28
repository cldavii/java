package secao09.bankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Account account;

        System.out.print("Enter account number: ");
        short accountNumber = scanner.nextShort();
        System.out.print("Enter account holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.print("Is there an initial deposit? (y/n): ");
        char choosedOption = scanner.next().charAt(0);
        if (choosedOption == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scanner.nextDouble();
            account = new Account(accountNumber, holder, initialDeposit);
        } else {
            account = new Account(accountNumber, holder);
        }
        System.out.println("Account data:\n" + account);

        System.out.print("Enter a deposit value: ");
        account.deposit(scanner.nextDouble());
        System.out.println("Updated account data:\n" + account);

        System.out.print("Enter a withdraw value: ");
        account.withdraw(scanner.nextDouble());
        System.out.println("Updated account data:\n" + account);

        scanner.close();
    }
}
