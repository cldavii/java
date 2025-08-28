package secao08.increaseEmployeeSalary;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        employee.netSalary();
        System.out.println(employee.toString());

        System.out.print("Which percentage to increase salary: ");
        double percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee.toString());
        scanner.close();
    }
}
