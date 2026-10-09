package learning.topic04.practice;

public class TestCase {
    String name;
    int priority;
    boolean passed;
}

class Practice04 {
    void main() {
        TestCase loginTest = new TestCase();
        loginTest.name = "Login";
        loginTest.priority = 1;
        loginTest.passed = true;
        IO.println(loginTest.name);
        IO.println(loginTest.priority);
        IO.println(loginTest.passed);

        TestCase logoutTest = new TestCase();
        logoutTest.name = "Logout";
        logoutTest.priority = 2;
        logoutTest.passed = false;
        IO.println(logoutTest.name);
        IO.println(logoutTest.priority);
        IO.println(logoutTest.passed);
    }
}
