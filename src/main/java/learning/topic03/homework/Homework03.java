package learning.topic03.homework;

public class Homework03 {
    void main() {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;

        double result = i2 / d1 + d2 % i1 - l; //-16,7
        IO.println(result);

        int a = 5;
        int resultA = a-- - --a + ++a + a++ + a; //15
        IO.println(resultA);

        int b = 8;
        int resultB = ++b - b++ + ++b - --b; //1
        IO.println(resultB);
    }
}
