package learning.topic10.homework.p4;

import learning.topic10.homework.p1.A; // Обычный импорт позволяет использовать короткое имя класса.
import learning.topic10.homework.p1.p2.p3.C;
import learning.topic10.homework.p4.p5.E;
import static learning.topic10.homework.p1.p2.B.printName; // Статический импорт позволяет вызвать метод B без имени класса.

public class D {
    void main() {
        A a1 = new A();
        C c1 = new C();
        E e1 = new E();
        e1.printName();
        c1.printName();
        a1.printName();
        printName();
    }
}
