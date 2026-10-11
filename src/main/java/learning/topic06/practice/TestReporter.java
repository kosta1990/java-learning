package learning.topic06.practice;

public class TestReporter {
    String projectName;

    TestReporter(String projectName) {
        this.projectName = projectName;
    }

    TestReporter(){
        this("Default project");
    }

    void report(boolean passed) {
        IO.println("Result: " + passed);
    }
    void report(String testName, boolean passed) {
        IO.println("Test - " + testName + ", " + "result: " + passed);
    }

}

class Practice06 {
    void main () {
        TestReporter reporter1 = new TestReporter("Java learning");
        reporter1.report(true);
        reporter1.report("Login", false);
        IO.println(reporter1.projectName);
        TestReporter reporter2 = new TestReporter();
        IO.println(reporter2.projectName);
    }
}
