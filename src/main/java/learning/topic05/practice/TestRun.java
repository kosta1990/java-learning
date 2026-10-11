package learning.topic05.practice;

public class TestRun {
    TestRun (int initialPassedTests){
        passedTests = initialPassedTests;
    }
    int passedTests;

    void registerPassedTest() {
        passedTests++;
    }
    void registerPassedTests(int count) {
        passedTests += count;
    }
    int getPassedTests(){
        return passedTests;
    }
}

class Practice05 {
    void main() {
        TestRun testRun = new TestRun(10);
        IO.println("Passed tests: " + testRun.passedTests);
        testRun.registerPassedTest();
        testRun.registerPassedTest();
        IO.println("Passed tests: " + testRun.passedTests);
        testRun.registerPassedTests(3);
        IO.println("Passed tests: " + testRun.passedTests);
        int result = testRun.getPassedTests();
        IO.println("Passed tests: " + result);
    }
}