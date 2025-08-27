package secao08.increaseEmployeeSalary;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Gross Salary: ");
        double grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        double tax = scanner.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);
        employee.netSalary();
        System.out.println(employee.toString());

        System.out.print("Which percentage to increase salary: ");
        double percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee.toString());
    }
}
