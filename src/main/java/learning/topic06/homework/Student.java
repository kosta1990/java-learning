package learning.topic06.homework;

public class Student {
    int studentId;
    String name;
    String lastName;
    int yearOfStudy;
    double averageMath;
    double averageEconomics;
    double averageLanguage;

    Student() {
    }

    Student(int id, String name, String lastName, int yearOfStudy, double averageMath, double averageEconomics, double averageLanguage) {
        this.studentId = id;
        this.name = name;
        this.lastName = lastName;
        this.yearOfStudy = yearOfStudy;
        this.averageMath = averageMath;
        this.averageEconomics = averageEconomics;
        this.averageLanguage = averageLanguage;
    }

    Student(int id, String name, String lastName, int yearOfStudy) {
        this.studentId = id;
        this.name = name;
        this.lastName = lastName;
        this.yearOfStudy = yearOfStudy;
    }

}
class StudentTest {
    void printAverageGrade(Student student) {
        double average = (student.averageMath + student.averageEconomics + student.averageLanguage) / 3;
        IO.println(student.name + " " + student.lastName + ": average grade = " + average);
    }
   void main() {
       Student s1 = new Student(1, "John", "Doe", 2, 9.0, 11, 8.5);
       Student s2 = new Student(2, "Jane", "Smith", 3);
       Student s3 = new Student();
       printAverageGrade(s1);
       printAverageGrade(s2);
       printAverageGrade(s3);
   }
}
