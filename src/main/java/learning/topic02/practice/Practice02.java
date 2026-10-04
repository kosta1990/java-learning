package learning.topic02.practice;

public class Practice02 {
    void main() {
        //task1
        int testCount = 10;
        boolean testPassed = false;
        IO.println(testCount);
        IO.println(testPassed);
        testCount = 12;
        testPassed = true;
        IO.println(testCount);
        IO.println(testPassed);
        //task2
        byte retryCount = 3;
        long processedRecords = 3_000_000_000L;
        float responseTime = 0.5F;
        char testGroup = 'A';
        //task3
        int decimalValue = 10;
        int binaryValue = 0b1010;
        int octalValue = 012;
        int hexValue = 0xA;
        IO.println(decimalValue);
        IO.println(binaryValue);
        IO.println(octalValue);
        IO.println(hexValue);
    }
}
