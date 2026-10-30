package learning.topic12.homework;

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
    void compareStudents(Student first, Student second) {
        // Один if: сравни все семь полей через &&
        // Выведи, совпадают ли данные студентов
        if (first.studentId == second.studentId
                && first.name.equals(second.name)
                && first.lastName.equals(second.lastName)
                && first.yearOfStudy == second.yearOfStudy
                && first.averageMath == second.averageMath
                && first.averageEconomics == second.averageEconomics
                && first.averageLanguage == second.averageLanguage) {
            IO.println("Students match");
        } else {
            IO.println("Students mismatch");
        }
    }

    void compareStudentsDetailed(Student first, Student second) {
        // Вложенные проверки полей
        if (first.studentId == second.studentId) {
            if (first.name.equals(second.name)) {
                if (first.lastName.equals(second.lastName)){
                    if (first.yearOfStudy == second.yearOfStudy){
                        if (first.averageMath == second.averageMath){
                            if (first.averageEconomics == second.averageEconomics){
                                if (first.averageLanguage == second.averageLanguage){
                                    IO.println("Students match");
                                } else {
                                    IO.println("Different language grades");
                                }
                            } else {
                                IO.println("Different economics grades");
                            }
                        } else {
                            IO.println("Different math grades");
                        }
                    } else {
                        IO.println("Different years of study");
                    }
                } else {
                    IO.println("Different surnames");
                }
            } else {
                IO.println("Different names");
            }
        } else {
            IO.println("Different IDs");
        }
    }

    void main() {
        Student student1 = new Student(1, "John", "Sue ",2023, 4.5, 4.0, 3.5);
        Student student2 = new Student(1, "John", "Doe", 2023, 4.5, 4.0, 3.5);
        compareStudents(student1, student2);
        compareStudentsDetailed(student1, student2);
        student2.averageMath = 6.0;
        compareStudents(student1, student2);
        compareStudentsDetailed(student1, student2);
    }
}

