package learning.topic08.homework;

public class Calculator {
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    static void divide(int a, int b) {
        IO.println("Result of division: " + a / b);
        IO.println("Remainder of division: " + a % b);
    }
}
class CalculatorTest {
    void main() {
        IO.println(Calculator.multiply(1, 2, 3));
        IO.println(Calculator.multiply(4, 5, 6));
        Calculator.divide(10, 3);
        Calculator.divide(15, 4);
    }
}