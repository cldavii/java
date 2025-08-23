package secao04;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        byte employeeId = scanner.nextByte();
        short employeeWorkedTime = scanner.nextShort();
        float employeeValuePerHourWorked = scanner.nextFloat();

        float salary = employeeValuePerHourWorked * employeeWorkedTime;
        System.out.println("NUMBER = " + employeeId);
        System.out.println("SALARY = U$" + String.format("%.2f", salary));

        scanner.close();
    }
}
