package secao08.studentFinalGrade;

public class Student {
    public String name;
    public float grade1;
    public float grade2;
    public float grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public void missingPoints() {
        System.out.println("MISSING " + String.format("%.2f", 60 - finalGrade()));
    }
}
