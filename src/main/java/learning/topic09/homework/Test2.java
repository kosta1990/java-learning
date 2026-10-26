package learning.topic09.homework;

/*
 * Параметр скрывает одноимённое поле.
 * final запрещает присваивать параметру новое значение.
 * Статическое поле можно читать через имя класса.
 */
public class Test2 {
    int a = 1;
    static int b = 2;

    static void abc(final int a) {
        // a = 7; // Ошибка: параметр объявлен final

        IO.println(a);       // Параметр метода
        IO.println(Test2.b); // Статическое поле класса
    }

    void main() {
        abc(5);
    }
}
