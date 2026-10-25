package learning.topic07.homework.external;

import learning.topic07.homework.Employee;

public class ExternalEmployeeTest {
    void main() {
        Employee employee = new Employee(1, "John", 1000);
        //Employee employee2 = new Employee(2, "Jane");
        //Employee employee3 = new Employee(3000);
        employee.printSurname();
        employee.printId();
        employee.printSalary();
        IO.println(employee.surname);
        //IO.println(employee.id);
        //IO.println(employee.salary);
    }
}