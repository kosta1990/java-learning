package learning.topic08.practice;

public class Practice08 {
    void main() {
        TestCounter firstRun = new TestCounter();
        TestCounter secondRun = new TestCounter();
        firstRun.registerPassedTest();
        firstRun.registerPassedTest();
        secondRun.registerPassedTest();
        IO.println(firstRun.passedTests);
        IO.println(secondRun.passedTests);
        IO.println(TestCounter.getTotalPassedTests());
    }
}
