package learning.topic09.homework;

public class ObjectLifecycle {
    void main() {
        Object s1 = new Object();
        Object s2 = new Object();
        Object s3 = new Object();
        Object s4 = new Object();
        Object s5 = new Object();
        Object s6 = new Object();
        Object s7 = new Object();
        Object s8 = new Object();
        // Убираем ссылки на первые шесть объектов.
        // Через s7 и s8 остаются доступны два объекта.
        // Немедленное удаление остальных сборщиком мусора не гарантируется.
        s1 = null;
        s2 = s1;
        s3 = s2;
        s4 = s3;
        s5 = null;
        s6 = null;
    }
}
