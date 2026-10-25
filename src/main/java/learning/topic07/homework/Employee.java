package learning.topic07.homework;

public class Employee {
    private double salary;
    public String surname;
    int id;
    public void printSalary() {
        IO.println(salary);
    }
    public void printId() {
        IO.println(id);
    }
    public void printSurname() {
        IO.println(surname);
    }
    public Employee (int id, String surname, double salary){
        this.id = id;
        this.surname = surname;
        this.salary = salary;
    }
    Employee (int id, String surname){
        this.id = id;
        this.surname = surname;
    }
    private Employee (double salary){
        this.salary = salary;
    }
}
