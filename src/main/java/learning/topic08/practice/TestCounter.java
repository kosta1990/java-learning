package learning.topic08.practice;

public class TestCounter {
    int passedTests;
    static int totalPassedTests;
    static final int MAX_RETRIES = 3;
    void registerPassedTest(){
        passedTests++;
        totalPassedTests++;
    }
    static int getTotalPassedTests() {
        return totalPassedTests;
    }
}
