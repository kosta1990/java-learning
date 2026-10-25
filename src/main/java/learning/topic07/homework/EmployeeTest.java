package learning.topic07.homework;

public class EmployeeTest {
    void main(){
        Employee employee = new Employee(1, "John", 1000);
        Employee employee2 = new Employee(2, "Jane");
        //Employee employee3 = new Employee(3000);
        employee.printSurname();
        employee.printId();
        employee.printSalary();
        IO.println(employee.surname);
        IO.println(employee.id);
        //IO.println(employee.salary);
    }
}
