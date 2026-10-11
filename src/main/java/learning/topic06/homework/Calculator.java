package learning.topic06.homework;

public class Calculator {
    int sum(){
        IO.println("Sum = 0");
        return 0;
    }
    int sum (int a){
        IO.println("Sum = " + a);
        return a;
    }
    int sum (int a, int b){
        IO.println("Sum = " + (a + b));
        return a + b;
    }
    int sum(int a, int b, int c){
        IO.println("Sum = " + (a + b + c));
        return a + b + c;
    }
    int sum(int a, int b, int c, int d){
        IO.println("Sum = " + (a + b + c + d));
        return a + b + c + d;
    }
}
class CalculatorTest {
    void main(){
        Calculator calc = new Calculator();
        calc.sum();
        calc.sum(1);
        calc.sum(1, 2);
        calc.sum(1, 2, 3);
        calc.sum(1, 2, 3, 4);
    }
}
