package learning.topic05.homework;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee (int employeeId, String employeeSurname, int employeeAge, double employeeSalary, String employeeDepartment){
        id = employeeId;
        surname = employeeSurname;
        age = employeeAge;
        salary = employeeSalary;
        department = employeeDepartment;
    }

    void doubleSalary(){
        salary *= 2;
    }

}
class EmployeeTest{
    void main () {
        Employee employee1 = new Employee(1, "Doe", 30, 1000, "IT");
        Employee employee2 = new Employee(2, "Smith", 25, 1500, "HR");
        employee1.doubleSalary();
        employee2.doubleSalary();
        IO.println(employee1.surname + ": " + employee1.salary);
        IO.println(employee2.surname + ": " + employee2.salary);
    }
}
