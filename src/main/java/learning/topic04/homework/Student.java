package learning.topic04.homework;

public class Student {
    int studentId;
    String name;
    String lastName;
    int yearOfStudy;
    double averageMath;
    double averageEconomics;
    double averageLanguage;

    double averageGrade (double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
class StudentTest {
    void main() {
        Student student1 = new Student();
        student1.studentId = 1;
        student1.name = "John";
        student1.lastName = "Doe";
        student1.yearOfStudy = 2;
        student1.averageMath = 8.5;
        student1.averageEconomics = 7.2;
        student1.averageLanguage = 9.0;
        double averageSt1 = student1.averageGrade(student1.averageMath, student1.averageEconomics, student1.averageLanguage);
        IO.println(student1.name + " " + student1.lastName + ": average grade = " + averageSt1);

        Student student2 = new Student();
        student2.studentId = 2;
        student2.name = "Jane";
        student2.lastName = "Smith";
        student2.yearOfStudy = 3;
        student2.averageMath = 9.0;
        student2.averageEconomics = 8.5;
        student2.averageLanguage = 8.8;
        double averageSt2 = student2.averageGrade(student2.averageMath, student2.averageEconomics, student2.averageLanguage);
        IO.println(student2.name + " " + student2.lastName + ": average grade = " + averageSt2);

        Student student3 = new Student();
        student3.studentId = 3;
        student3.name = "Alice";
        student3.lastName = "Johnson";
        student3.yearOfStudy = 1;
        student3.averageMath = 7.5;
        student3.averageEconomics = 6.8;
        student3.averageLanguage = 8.2;
        double averageSt3 = student3.averageGrade(student3.averageMath, student3.averageEconomics, student3.averageLanguage);
        IO.println(student3.name + " " + student3.lastName + ": average grade = " + averageSt3);

    }
}
