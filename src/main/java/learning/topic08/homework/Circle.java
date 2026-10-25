package learning.topic08.homework;

public class Circle {
    static final double PI = 3.14;
    double area(double radius) {
        return PI * radius * radius;
    }
    static double circumference(double radius) {
        return 2 * PI * radius;
    }
    void printInfo(double radius) {
        IO.println("Circle radius: " + radius);
        IO.println("Circle area: " + area(radius));
        IO.println("Circle circumference: " + circumference(radius));
    }
}

class CircleTest {
    void main() {
        Circle circle = new Circle();
       IO.println(circle.area(5));
       IO.println(Circle.circumference(5));
       circle.printInfo(5);
    }
}
