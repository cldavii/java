package secao08.studentFinalGrade;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Student student = new Student();
        student.name = scanner.nextLine();
        student.grade1 = scanner.nextInt();
        student.grade2 = scanner.nextInt();
        student.grade3 = scanner.nextInt();
        double finalGrade = student.finalGrade();
        if (finalGrade > 60.00) {
            System.out.println("FINAL GRADE = " + String.format("%.2f", finalGrade));
            System.out.println("PASS");
        } else {
            System.out.println("FINAL GRADE = " + String.format("%.2f", finalGrade));
            System.out.println("FAILED");
            student.missingPoints();
        }
        scanner.close();
    }
}
