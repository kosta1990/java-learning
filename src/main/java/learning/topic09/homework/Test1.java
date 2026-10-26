package learning.topic09.homework;

/*
 * Два поля одного класса не могут иметь одинаковое имя,
 * даже если одно из них static.
 */
public class Test1 {
    int a = 1;
    // static int a = 2;

    void abc(int a) {
        IO.println(a);      // Параметр метода
        IO.println(this.a); // Поле текущего объекта
    }

    void main() {
        Test1 test = new Test1();
        test.abc(3);
    }
}
