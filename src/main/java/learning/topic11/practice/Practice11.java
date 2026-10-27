package learning.topic11.practice;

/*
 * Тема 11: передача аргументов в методы.
 * Параметр получает копию значения исходной переменной.
 */
public class Practice11 {
    void changeCount(int count) {
        count = 10;
        IO.println("Inside method: " + count);
    }
    void changeResult(TestResult result) {
        result = new TestResult();
        result.passedTests = 10;
    }

    void main() {
        int testCount = 3;
        changeCount(testCount);
        IO.println("After method: " + testCount);
        TestResult testResult = new TestResult();
        testResult.passedTests = 3;
        changeResult(testResult);
        IO.println(testResult.passedTests);
    }
}
