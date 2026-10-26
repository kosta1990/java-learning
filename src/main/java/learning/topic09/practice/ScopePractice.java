package learning.topic09.practice;

public class ScopePractice {
    int count = 10;

    void printCount(int count) {
        int bonus = 2;
        IO.println(count + bonus);
    }

    void main() {
        printCount(3);
        //IO.println(bonus);
    }
}