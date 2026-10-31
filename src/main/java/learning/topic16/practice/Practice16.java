package learning.topic16.practice;

public class Practice16 {
    void printTestName(String logLine) {
        // Извлеки и выведи текст между [ и ]
        int start = 0;
        while(logLine.indexOf("[", start) != -1) {
        int startIndex = logLine.indexOf("[", start);
        int endIndex = logLine.indexOf("]", start+1);
        IO.println(logLine.substring(startIndex+1, endIndex));
        start = endIndex + 1;
        }

    }
    void main() {
        // String неизменяем: результат преобразования нужно использовать отдельно.
        String status = "[LoginTest] passed; [CheckoutTest] failed; [LogoutTest] passed;";
        IO.println(status);
        printTestName(status);
    }
}
