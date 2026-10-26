package learning.topic10.practice;

import static learning.topic10.practice.tools.TestSettings.printProjectName;
import static learning.topic10.practice.tools.TestSettings.DEFAULT_RETRIES;

public class Practice10 {
    void main() {
        // Используем статический метод и константу без имени класса.
        printProjectName();
        IO.println(DEFAULT_RETRIES);
    }
}
