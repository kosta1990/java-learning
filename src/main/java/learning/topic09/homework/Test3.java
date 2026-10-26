package learning.topic09.homework;

/*
 * a — параметр метода.
 * this.a — поле текущего объекта.
 * b и Test3.b — одно статическое поле класса.
 */
public class Test3 {
    int a = 1;
    static int b = 2;

    void abc(int a) {
        IO.println(b);
        IO.println(a);
        IO.println(this.a);
        IO.println(Test3.b);
    }

    void main() {
        Test3 test = new Test3();
        test.abc(4);
    }
}
