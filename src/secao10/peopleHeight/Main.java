package secao10.peopleHeight;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantas pessoas serao digitadas? ");
        byte n = scanner.nextByte();
        Person[] people = new Person[n];

        for (byte i = 0; i < people.length; i++) {
            System.out.println("Dados da 1a pessoa:");
            System.out.print("Nome: ");
            String name = scanner.next();
            System.out.print("Idade: ");
            byte age = scanner.nextByte();
            System.out.print("Altura: ");
            float height = scanner.nextFloat();
            Person person = new Person(name, age, height);
            people[i] = person;
        }
        float sum = 0;
        for (Person person : people) {
            sum += person.height();
        }
        float average = sum / people.length;
        System.out.println("\nAltura média: " + String.format("%.2f",  average));

        byte lowerThan16 = 0;
        for (Person person : people) {
            if (person.age() < 16) {
                lowerThan16++;
            }
        }
        float percentageLower16 = ((float) lowerThan16 / people.length) * 100;
        System.out.println("Pessoas com menos de 16 anos: " + percentageLower16 + "%");

        for (Person person : people) {
            if (person.age() < 16) {
                System.out.println(person.name());
            }
        }
        scanner.close();
    }
}
