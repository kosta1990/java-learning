package learning.topic05.homework;

public class Student {
    int studentId;
    String name;
    String lastName;
    int yearOfStudy;
    double averageMath;
    double averageEconomics;
    double averageLanguage;

}
class StudentTest {
    void printAverageGrade(Student student) {
        double average = (student.averageMath + student.averageEconomics + student.averageLanguage) / 3;
        IO.println(student.name + " " + student.lastName + ": average grade = " + average);
    }
    void main() {
        Student student1 = new Student();
        student1.studentId = 1;
        student1.name = "John";
        student1.lastName = "Doe";
        student1.yearOfStudy = 2;
        student1.averageMath = 8.5;
        student1.averageEconomics = 7.2;
        student1.averageLanguage = 9.0;
        printAverageGrade(student1);

        Student student2 = new Student();
        student2.studentId = 2;
        student2.name = "Jane";
        student2.lastName = "Smith";
        student2.yearOfStudy = 3;
        student2.averageMath = 9.0;
        student2.averageEconomics = 8.5;
        student2.averageLanguage = 8.8;
        printAverageGrade(student2);

        Student student3 = new Student();
        student3.studentId = 3;
        student3.name = "Alice";
        student3.lastName = "Johnson";
        student3.yearOfStudy = 1;
        student3.averageMath = 7.5;
        student3.averageEconomics = 6.8;
        student3.averageLanguage = 8.2;
        printAverageGrade(student3);

    }
}
