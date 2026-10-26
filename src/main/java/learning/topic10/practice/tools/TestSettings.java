package learning.topic10.practice.tools;

/*
 * Тема 10: обычный и статический импорт.
 * Этот класс предоставляет константу и статический метод.
 */

public class TestSettings {
    public static final int DEFAULT_RETRIES = 3;
    public static void printProjectName() {
        IO.println("Java learning");
    }
}
